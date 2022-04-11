package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class except{

    public static void main(String[] args) {
        int[] arr = {1, 2, 34,7, 6};
        System.out.println(Arrays.toString(arr));

        PrintWriter pw;
        try {
            pw = new PrintWriter("jtl.oxt"); //may throw exception
            pw.println("saved");
            int a=10;
            a=a/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        // providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}