package com.example;

public class Main {
    public static void main(String[] args) {
        // Default value
        String resultName = "World";

        // UC 5: Using Enhanced For Loop
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean isFirst = true;

            // The enhanced for loop: iterates through each 'arg' in the 'args' array
            for (String name : args) {
                // If it's NOT the first name, add a comma separator before the name
                if (!isFirst) {
                    nameBuilder.append(", ");
                }

                nameBuilder.append(name);

                // After the first iteration, set the flag to false
                isFirst = false;
            }
            resultName = nameBuilder.toString();
        }

        System.out.println("Hello, " + resultName + "!");
    }
}