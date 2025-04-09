package models;

public class ChickenBurger extends Burger {
    public ChickenBurger() {
        super();
        ingredients.add("Chicken Patty");
    }
    
    @Override
    public String name() {
        return "Chicken Burger";
    }
    
    @Override
    public float price() {
        return 6.99f + (pattyCount - 1) * 1.75f; // Base price + extra patties
    }
}