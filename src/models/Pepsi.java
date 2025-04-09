package models;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi" + (isCold ? " (Cold)" : " (Room Temp)");
    }
    
    @Override
    public float price() {
        return 2.49f;
    }
}