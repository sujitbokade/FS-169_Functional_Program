package com.bridgelabz.functional;

import java.util.Scanner;

public class Array2D {
    static void Array(){

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number of rows R");
        int m = scr.nextInt();
        System.out.println("Enter number of column C");
        int n = scr.nextInt();
        int[][] A = new int[m][n];
        System.out.println("input");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                A[i][j] = scr.nextInt();

            }
        }

        System.out.println("output");
        for (int i=0;i< A.length;i++){
            for (int j=0;j<A[i].length;j++){

                System.out.println("A["+i+"]["+j+"] = "+A[i][j]);
            }
        }
    }

    public static void main(String[] args) {
            Array();
    }
}
