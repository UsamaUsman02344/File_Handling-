package com.filehandling;
import java.io.*;

public class readIntegerFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\lenovo\\Desktop\\usama.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;

        int sumOfTextNumbers = 0;

        try {
            while((str = br.readLine()) !=null) {
                sumOfTextNumbers +=Integer.parseInt(str);
                System.out.println(str);
            }

            System.out.println("The sum of all Numbers in the text file "+sumOfTextNumbers);

        }

        catch (IOException i){
            i.printStackTrace();
        }
    }
}
