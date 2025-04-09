package services;

import models.*;

import java.util.Scanner;

public class OrderService {
    private Scanner scanner;
    private Meal meal;
    
    public OrderService() {
        this.scanner = new Scanner(System.in);
        this.meal = new Meal();
    }
    
    public Order createOrder() {
        System.out.println("\n=== Welcome to Fast Food Restaurant ===");
        Customer customer = getCustomerDetails();
        
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addBurger();
                    break;
                case 2:
                    addColdDrink();
                    break;
                case 3:
                    addFries();
                    break;
                case 4:
                    meal.showItems();
                    if (confirmOrder()) {
                        return new Order(meal, customer);
                    }
                    break;
                case 5:
                    System.out.println("Order cancelled.");
                    return null;
                case 6:
                    System.out.println("Thank you for visiting!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    
    private void showMenu() {
        System.out.println("\n1. Add Burger");
        System.out.println("2. Add Cold Drink");
        System.out.println("3. Add Fries");
        System.out.println("4. Review and Confirm Order");
        System.out.println("5. Cancel Order");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");
    }
    
    private Customer getCustomerDetails() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();
        return new Customer(name, phone);
    }
    
    private void addBurger() {
        System.out.println("\n1. Veg Burger");
        System.out.println("2. Chicken Burger");
        System.out.print("Choose burger type: ");
        int type = scanner.nextInt();
        scanner.nextLine();
        
        Burger burger = (type == 1) ? new VegBurger() : new ChickenBurger();
        
        while (true) {
            System.out.println("\nBurger Customization:");
            System.out.println("1. Add Extra Patty");
            System.out.println("2. Add Hot Sauce");
            System.out.println("3. Done");
            System.out.print("Choose option: ");
            int option = scanner.nextInt();
            
            if (option == 1) burger.addPatty();
            else if (option == 2) burger.addIngredient("Hot Sauce");
            else if (option == 3) break;
            else System.out.println("Invalid option");
        }
        
        meal.addItem(burger);
    }
    
    private void addColdDrink() {
        System.out.println("\n1. Coke");
        System.out.println("2. Pepsi");
        System.out.print("Choose drink: ");
        int type = scanner.nextInt();
        
        ColdDrink drink = (type == 1) ? new Coke() : new Pepsi();
        
        System.out.print("Cold (1) or Room Temp (2)? ");
        drink.setTemperature(scanner.nextInt() == 1);
        
        meal.addItem(drink);
    }
    
    private void addFries() {
        System.out.print("\nCurly (1) or Straight (2) Fries? ");
        Fries fries = new Fries(scanner.nextInt() == 1);
        meal.addItem(fries);
    }
    
    private boolean confirmOrder() {
        System.out.print("\nConfirm order? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }
}