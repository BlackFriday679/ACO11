package ua.artcode.controller;

/**
 * Created by serhii on 28.02.16.
 */
public interface UserController { // endpoint

    //
    String register(String login, String pass, String phone) throws RegisterException;

    // access token
    String login(String login, String pass) throws LoginCredentialException;

    Address checkAddress(String stree, String num, String accessToken) throws InvalidAddressInfoException;

    Order makeOrder(Address from, Address to, double price, String accessToken);

    Order findDriver(Order order, String accessToken) throws NoDriverFoundException;

    Order getOrderInfo(int id, String accessToken) throws NoOrderFoundException;

    String cancelOrder(int orderId, String accessToken) throws NoOrderFoundException;

    List<Order> showHistory(String accessToken);




}
