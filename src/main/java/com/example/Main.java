package com.example;

public class Main {
    public static void main(String[] args) {
        // Default value if no arguments are provided
        String name = "World";

        // UC 4: Greet Multiple Users
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                // Add a comma and space only if it's NOT the last element
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            // Convert the builder content to the final string
            name = nameBuilder.toString();
        }

        // Output the result
        System.out.println("Hello, " + name + "!");
    }
}