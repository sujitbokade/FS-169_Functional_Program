package com.bridgelabz.functional;
import java.util.Scanner;


public class WindChill {
    static int result(int t,int v){
        if(t<50 && v<120 && v>3){
            double WindChill=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
            System.out.println("WindChill is "+WindChill);
        }

        else{
            System.out.println("Enter value beyond limit");
        }
                    return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit ");
        int t=sc.nextInt();
        System.out.println("Enter Wind Speed ");
        int v=sc.nextInt();

        result(t,v);

    }
}
