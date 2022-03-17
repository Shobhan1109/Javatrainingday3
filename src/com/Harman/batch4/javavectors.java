package com.Harman.batch4;

import java.util.Vector;


    public class javavectors {
        public static void main(String[] args) {
            Vector<String> birds=new Vector<>();//vector creation syntax
            birds.add("Eagle");
            birds.add("Sparrow");
            birds.add("Bat");
            birds.add("Peacock");
            System.out.println(birds);
            Vector<String> animals=new Vector<>();
            animals.add("Lion");
            animals.add("Tiger");
            System.out.println(animals);
            animals.addAll(birds);
        }
    }


