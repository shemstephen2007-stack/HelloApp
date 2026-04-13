package com.example;

public class Main {
    public static void main(String[] args) {
        // Default value
        String resultName = "World";

        // UC 6: Using Substring to Remove Trailing Delimiter
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();

            // Append every name followed by a comma and space
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // At this point, nameBuilder looks like "Alice, Bob, Charlie, "
            // We need to remove the last two characters (the comma and the space)
            if (nameBuilder.length() > 0) {
                resultName = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }

        System.out.println("Hello, " + resultName + "!");
    }
}