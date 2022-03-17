package com.Harman.batch4;
import java.util.Stack;

public class javastacks {
    public static void main(String[] args) {
        Stack<String> birds=new Stack<>(); //Stack creation syntax
        birds.push("Eagle");
        birds.push("Sparrow");
        birds.push("Bat");
        birds.push("Peacock"); //pushing data into the stack
        System.out.println(birds);
        birds.pop(); //popping data from the stack i.e, last in first out LIFO
        System.out.println(birds);
        int x= birds.search("Eagle"); //searching the position of an element
        System.out.println(x);
        birds.clear();//clearing the stack completely
        System.out.println(birds);
        if(birds.empty()) { // used to check weather the stack is empty or not
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(birds);
        }
    }
}
