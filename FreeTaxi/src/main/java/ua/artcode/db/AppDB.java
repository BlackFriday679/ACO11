package ua.artcode.db;

import ua.artcode.exception.LoginCredentialException;
import ua.artcode.model.Address;
import ua.artcode.model.Order;
import ua.artcode.model.OrderState;
import ua.artcode.model.User;

import java.util.*;

/**
 * Multithreading !!!!
 */
public class AppDB { // container data

    private int userIdCount = 0;
    private long orderIdCount = 0;

    private Map<String, User> accessTokenUserMap;

    private Map<Integer, User> userMap;

    private Map<Long, Order> orderMap;

    private List<Order> history;

    private List<Order> newOrders;

    public AppDB() {

        userMap = new TreeMap<>();
        accessTokenUserMap = new HashMap<>();

        history = new ArrayList<>();
        newOrders = new LinkedList<>();

        orderMap = new TreeMap<>();

        initDb();
    }

    private void initDb() {
        User user = new User(userIdCount++, "+30933332312", "user", "1234");
        User driver = new User(userIdCount++, "+30933332312", "driver", "1234");
        for (int i = 0; i < 100; i++) {
            history.add(
                    new Order(orderIdCount++,
                            new Address("Kiev", "Ushin", "5a"),
                            new Address("odessa", "Dereb", "1"),
                            OrderState.DONE, 1000, 500,
                            user,
                            driver));
        }

        userMap.put(user.getId(),user);
        accessTokenUserMap.put("1111",user);
    }

    // register
    public User addUser(User user) {
        user.setId(userIdCount);
        userMap.put(userIdCount, user);
        userIdCount++;
        return user;
    }

    // login
    public String createAccessToken(User user) throws LoginCredentialException {
        User found =
                userMap.values()
                        .stream()
                        .filter(u -> u.getName().equals(user.getName()))
                        .filter(u -> u.getPass().equals(user.getPass()))
                        .findFirst().orElse(null);

        if (found == null) {
            throw new LoginCredentialException("invalid login or pass");
        } else {
            String accessKey = UUID.randomUUID().toString();
            accessTokenUserMap.put(accessKey, found);
            return accessKey;
        }
    }

    public Order addOrder(Order order) {
        order.setId(orderIdCount);

        orderMap.put(orderIdCount, order);
        newOrders.add(order);

        orderIdCount++;

        return order;
    }

    public Order getOrderById(int id) {
        return orderMap.get(id);
    }

    public boolean hasToken(String accessToken) {
        return accessTokenUserMap.containsKey(accessToken);
    }

    public List<Order> getAllHistory() {
        return history;
    }


}
