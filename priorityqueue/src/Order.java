public class Order implements Comparable<Order>{

    private int orderId;
    private double orderAmount;
    private String customerName;

    public Order(int orderId, double orderAmount, String customerName) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.customerName = customerName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public int compareTo(Order o) {
        return o.orderId > this.orderId ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderAmount=" + orderAmount +
                ", customerName='" + customerName + '\'' +
                '}';
    }


}
