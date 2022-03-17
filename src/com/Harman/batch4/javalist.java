package com.Harman.batch4;

import java.util.ArrayList;

public class javalist {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();//array creation syntax
        name.add("Shobhan");
        name.add("Raj");
        name.add("S");//adding data into a list
        System.out.println(name);
        System.out.println("First name: " + name.get(0));
        System.out.println("Middle name: " + name.get(1));
        System.out.println("Last name: " + name.get(2));//printing the list data using indexing
    }
}