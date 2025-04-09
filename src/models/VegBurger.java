package models;

public class VegBurger extends Burger {
    public VegBurger() {
        super();
        ingredients.add("Soya Patty");
    }
    
    @Override
    public String name() {
        return "Veg Burger";
    }
    
    @Override
    public float price() {
        return 5.99f + (pattyCount - 1) * 1.50f; // Base price + extra patties
    }
}