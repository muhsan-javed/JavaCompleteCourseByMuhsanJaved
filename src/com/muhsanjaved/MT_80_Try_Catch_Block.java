package com.muhsanjaved;

public class MT_80_Try_Catch_Block {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        // With out Try:
//        int c = a/b;
//        System.out.println("The result is " + c);
        // With Try:
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason ");
            System.out.println(e);
        }

        System.out.println("End of the  Program");


    }
}
