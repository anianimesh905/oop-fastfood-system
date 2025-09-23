package models;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke" + (isCold ? " (Cold)" : " (Room Temp)");
    }
    
    @Override
    public float price() {
        return 2.49f;
    }
}