package ua.artcode.model;

/**
 * Created by serhii on 05.03.16.
 */
public class Order {

    private long id;

    private Address from;
    private Address to;

    private OrderState orderState;

    private int price;
    private double distance;

    private User client;

    // will be replaced by real driver Driver
    private User driver;

    public Order() {
    }

    public Order(long id, Address from, Address to,
                 OrderState orderState, int price,
                 double distance, User client, User driver) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.orderState = orderState;
        this.price = price;
        this.distance = distance;
        this.client = client;
        this.driver = driver;
    }

    public Order(Address from, Address to, User client) {
        this.from = from;
        this.to = to;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Address getFrom() {
        return from;
    }

    public void setFrom(Address from) {
        this.from = from;
    }

    public Address getTo() {
        return to;
    }

    public void setTo(Address to) {
        this.to = to;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id == order.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                ", orderState=" + orderState +
                ", price=" + price +
                ", distance=" + distance +
                ", client=" + client +
                ", driver=" + driver +
                '}';
    }
}
