package ua.artcode.controller;

import org.springframework.web.bind.annotation.*;
import ua.artcode.db.AppDB;
import ua.artcode.exception.*;
import ua.artcode.model.Address;
import ua.artcode.model.Order;
import ua.artcode.model.OrderState;
import ua.artcode.model.User;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/taxi")
public class UserControllerImpl implements UserController {

    private AppDB appDB = new AppDB();

    public UserControllerImpl() {
    }

    public UserControllerImpl(AppDB appDB) {
        this.appDB = appDB;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @Override
    public User register(@RequestParam(value = "login") String login,
                         @RequestParam(value = "pass") String pass,
                         @RequestParam(value = "phone") String phone) throws RegisterException {

        User user = new User();
        user.setName(login);
        user.setPass(pass);
        user.setPhone(phone);

        // validation user
        // if something wrong throw registerexception

        return appDB.addUser(user);
    }

    @Override
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "login") String login, @RequestParam(value = "pass") String pass) throws LoginCredentialException {

        User user = new User();
        user.setName(login);
        user.setPass(pass);

        return appDB.createAccessToken(user);
    }

    @Override
    public Address checkAddress(String street, String num, String accessToken) throws InvalidAddressInfoException {
        // google map api


        return null;
    }

    @Override
    @RequestMapping(value = "/order/make", method = RequestMethod.POST)
    public Order makeOrder(@RequestBody Order orderRequest,
                           @RequestParam(value = "price") double price,
                           @RequestParam(value = "accessToken") String accessToken) throws AppException {


        if (!appDB.hasToken(accessToken)) {
            throw new AppException("no access, login first");
        }

        // validation
        // business logic
        // check address [optional]
        // use google api
        // count distance
        // count price


        return appDB.addOrder(orderRequest);
    }

    @Override// submit
    public Order findDriver(Order order, String accessToken) throws AppException {
        if (!appDB.hasToken(accessToken)) {
            throw new AppException("no access, login first");
        }


        return null;
    }

    @Override// order/get/45
    @RequestMapping("/order/get/{id}/")
    public Order getOrderInfo(@PathParam("id") Integer id, @RequestParam(value = "accessToken") String accessToken) throws AppException {
        if (!appDB.hasToken(accessToken)) {
            throw new AppException("no access, login first");
        }

        return appDB.getOrderById(id);
    }

    @Override
    public String cancelOrder(Integer orderId, String accessToken) throws AppException {

        Order found = getOrderInfo(orderId, accessToken);

        if(found == null){
            throw new NoOrderFoundException("no order with id " + orderId);
        }

        found.setOrderState(OrderState.CANCELED);
        User driver = found.getDriver();
        // notify driver
        // send message

        return "found order";
    }

    @Override
    @RequestMapping("/order/all")
    public List<Order> showHistory(@RequestParam(value = "accessToken")String accessToken) throws AppException {
        if (!appDB.hasToken(accessToken)) {
            throw new AppException("no access, login first");
        }

        return appDB.getAllHistory();
    }
}
