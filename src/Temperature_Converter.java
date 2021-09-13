/*
 *  UCF COP3330 Fall 2021 Assignment 1.18 Solution
 *  Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String [] arg){
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. ");
        Scanner FCInp = new Scanner(System.in);
        String FC = FCInp.next();


        System.out.printf("Your choice: %s\n", FC);

        if(FC.equals("C") || FC.equals("c")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            Scanner tempInp = new Scanner(System.in);
            int temp = tempInp.nextInt();
            int outp = (temp - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %d.", outp);
        }
        if(FC.equals("F") || FC.equals("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            Scanner tempInp = new Scanner(System.in);
            int temp = tempInp.nextInt();
            int outp = ((temp * 9 / 5) + 32);
            System.out.printf("The temperature in Fahrenheit is %d.", outp);
        }
    }
}
