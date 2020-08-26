import java.util.Comparator;

public class OrderAmountComparator implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        return o1.getOrderAmount() < o2.getOrderAmount() ? 1 : -1;
    }
}
