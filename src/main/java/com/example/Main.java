package com.example;

public class Main {
    public static void main(String[] args) {
        // UC 7: Simplified string concatenation using String.join()
        String resultName = "World";

        if (args.length > 0) {
            // String.join(delimiter, elements) automatically handles the logic:
            // It joins the array elements with the comma and space,
            // and it intelligently omits the trailing comma.
            resultName = String.join(", ", args);
        }

        System.out.println("Hello, " + resultName + "!");
    }
}