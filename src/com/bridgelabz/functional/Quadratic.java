package com.bridgelabz.functional;
import java.lang.Math;
import java.util.Scanner;

public class Quadratic {

    static void roots(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter value a,b and c:");
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();
        double delta = b*b - 4*a*c;
        if ( delta < 0){
            System.out.println("Roots does not exist and  imaginary");
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 is : " + x1);
            System.out.println("Root 2 is : " + x2);
        }

    }
    public static void main(String[] args) {
        roots();
    }
}

