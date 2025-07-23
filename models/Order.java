package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    private Meal meal;
    private Customer customer;
    private String orderDateTime;
    
    public Order(Meal meal, Customer customer) {
        this.meal = meal;
        this.customer = customer;
        this.orderDateTime = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    
    public void showOrderSummary() {
        System.out.println("\n=== Order Summary ===");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Date/Time: " + orderDateTime);
        meal.showItems();
        System.out.println("Total: $" + String.format("%.2f", meal.getCost()));
        System.out.println("====================");
    }
}