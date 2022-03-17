package com.Harman.batch4;

import java.util.ArrayList;
import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> name=new ArrayList<>();
        System.out.println("Enter details of 3 students: ");
        int i=0;
        while (i<3)
        {
            name.add(input.next());
            i++;
        }
        System.out.println(name);
        }

    }