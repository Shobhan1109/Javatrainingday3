package com.Harman.batch4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecreation {
    public static void main(String[] args) {
        String data = "Welcome to java programming";
        try {
            FileOutputStream file = new FileOutputStream("Sample.txt");//syntax for file input for writing
            byte b[] = data.getBytes();
            file.write(b);//to write data into a file
            file.close();//to close the file after writing data into a file
            System.out.println("File created successfully");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);

        }
    }
}
