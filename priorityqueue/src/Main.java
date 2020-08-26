import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> intQueue = new PriorityQueue<>(new IntegerComparator());
        intQueue.add(20);
        intQueue.add(30);
        intQueue.add(10);
        intQueue.add(35);

        while (!intQueue.isEmpty()) {
            var value = intQueue.poll();
            System.out.println(value);
        }

        Queue<Order> orderQueue = new PriorityQueue<>();
        orderQueue.add(new Order(2, 150.0, "Rafid"));
        orderQueue.add(new Order(3, 120.0, "Ridoan"));
        orderQueue.add(new Order(1, 100.0, "Naushad"));

        System.out.println();
        System.out.println("========Order by id========");
        while (!orderQueue.isEmpty()) {
            var order = orderQueue.poll();
            System.out.println(order);
        }

        Queue<Order> orderQueueByAmount = new PriorityQueue<>(new OrderAmountComparator());
        orderQueueByAmount.add(new Order(2, 130.0, "Rafid"));
        orderQueueByAmount.add(new Order(3, 120.0, "Ridoan"));
        orderQueueByAmount.add(new Order(1, 180.0, "Naushad"));

        System.out.println();
        System.out.println("========Order by amount========");
        while (!orderQueueByAmount.isEmpty()) {
            var order = orderQueueByAmount.poll();
            System.out.println(order);
        }
    }
}
