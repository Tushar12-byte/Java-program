package com.Array;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        // Create a collection of strings using ArrayList
        Collection<String> names = new ArrayList<>();

        // Add elements to the collection
        names.add("Tejash");
        names.add("Ram");
        names.add("Mohit");
        
        // Display the elements
        System.out.println("Collection Elements: " + names);

        // Check if an element exists
        if (names.contains("Tejash")) {
            System.out.println("Tejash is present in the collection.");
        }

        // Remove an element
        names.remove("Ram");
        System.out.println("After removing Ram: " + names);

        // Get the size of the collection
        System.out.println("Collection size: " + names.size());
    }
}
