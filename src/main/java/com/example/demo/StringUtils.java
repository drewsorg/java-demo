package com.example.demo;

public class StringUtils {
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
    
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        return normalized.equals(reverse(normalized));
    }
    
    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}
