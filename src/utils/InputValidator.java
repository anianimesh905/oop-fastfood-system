package utils;

public class InputValidator {
    public static boolean isValidPhone(String phone) {
        return phone.matches("\\d{10}"); // Simple 10-digit validation
    }
    
    public static boolean isValidChoice(int choice, int min, int max) {
        return choice >= min && choice <= max;
    }
}