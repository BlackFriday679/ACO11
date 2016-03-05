package ua.artcode.controller;

import ua.artcode.exception.*;
import ua.artcode.model.Address;
import ua.artcode.model.Order;
import ua.artcode.model.User;

import java.util.List;

/**
 * Created by serhii on 28.02.16.
 */
public interface UserController { // endpoint

    //
    User register(String login, String pass, String phone) throws RegisterException;
    // access token
    String login(String login, String pass) throws LoginCredentialException;

    Address checkAddress(String stree, String num, String accessToken) throws InvalidAddressInfoException;

    Order makeOrder(Order orderRequest, double price, String accessToken) throws AppException;

    Order findDriver(Order order, String accessToken) throws AppException;

    Order getOrderInfo(Integer id, String accessToken) throws AppException;

    String cancelOrder(Integer orderId, String accessToken) throws AppException;

    List<Order> showHistory(String accessToken) throws AppException;




}
