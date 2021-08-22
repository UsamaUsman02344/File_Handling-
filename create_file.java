package com.filehandling;
import java.io.*;

public class create_file {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\lenovo\\Desktop\\usama.txt");

        try{
            if(f.createNewFile()) {
                System.out.println("File successfully crated:");
            }

            else {
                System.out.println("Already Exist!");
            }
        }

        catch(IOException i){
            System.out.println("Exception Handled!");
        }



    }
}
