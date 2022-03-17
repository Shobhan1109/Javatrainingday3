package com.Harman.batch4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filereading {
    public static void main(String[] args) {
        try {
            FileInputStream file=new FileInputStream("Sample.txt");//syntax for file input for reading
            int i=0;
            while ( (i=file.read())!=-1){
                System.out.println((char) i);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}