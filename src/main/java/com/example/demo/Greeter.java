package com.example.demo;

public class Greeter {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
    
    public static String greet() {
        return greet("World");
    }
}
