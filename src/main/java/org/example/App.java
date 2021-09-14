/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    static double isNumber(){
        int i = 1;
        double input = 0;
        boolean honest = in.hasNextDouble();
        while(i == 1){
            if(honest){
                input = in.nextDouble();
                i = 0;
            }
            else{
                System.out.println("Please enter a number.");
                in.next();
                honest = in.hasNextDouble();
            }
        }
        return input;
    }


    public static void main(String[] args) {

        double bac;
        int i = 1;

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        double gender = isNumber();
        System.out.print("How many ounces of alcohol did you have? ");
        double oz = isNumber();
        System.out.print("What is your weight, in pounds? ");
        double weight = isNumber();
        System.out.print("How many hours has it been since your last drink? ");
        double time = isNumber();

        while(i == 1){
            if(gender == 1 || gender == 2){
                i = 0;
            }
            else{
                System.out.println("Please enter 1 or 2.");
                gender = isNumber();
            }
        }

        if(gender == 1.0) {
            bac = Math.round(((oz * (5.14/weight)*0.73)-(0.015*time))*100.0)/100.0;
        }
        else{
            bac = Math.round(((oz * (5.14/weight)*0.66)-(0.015*time))*100.0)/100.0;
        }

        System.out.println("Your BAC is "+bac);
        if(bac < 0.08){
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is not legal for you to drive.");
        }
    }
}
