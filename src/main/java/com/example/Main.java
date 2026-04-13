package com.example;

public class Main {
    public static void main(String[] args) {
        // UC 3: Provide Default Value
        // We initialize the variable with the default "World"
        String name = "World";

        // Check if a name is provided as a command-line argument
        // If args.length is greater than 0, it means the user passed a name
        if (args.length > 0) {
            name = args[0]; // Update the variable with the provided name
        }

        // Display the greeting
        // This will print "Hello, World!" by default, or "Hello, [Name]!" if provided
        System.out.println("Hello, " + name + "!");
    }
}