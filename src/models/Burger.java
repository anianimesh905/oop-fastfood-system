package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Burger implements Item {
    protected List<String> ingredients = new ArrayList<>();
    protected int pattyCount = 1; // Minimum 1 patty compulsory
    
    public Burger() {
        ingredients.add("Mayo");
        ingredients.add("Salad");
        ingredients.add("Tomatoes");
        ingredients.add("Onions");
    }
    
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
    
    public void addPatty() {
        pattyCount++;
    }
    
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}