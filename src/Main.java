import services.OrderService;
import models.Order;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Order order = orderService.createOrder();
        
        if (order != null) {
            order.showOrderSummary();
        }
    }
}