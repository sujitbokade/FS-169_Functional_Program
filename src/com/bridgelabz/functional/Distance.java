package com.bridgelabz.functional;

public class Distance {
public static double distance(double x1, double y1, double x2, double y2){
    double x = Math.pow(x2-x1, 2);
    double y = Math.pow(y2-y1, 2);
    double dist = Math.sqrt(x+y);

    return dist;
        }

    public static void main(String[] args) {
        double x1=5;
        double y1=5;
        double x2=5;
        double y2=0;

        double distresult = distance ( x1,y1,x2,y2);
        System.out.println(distresult);
    }

}
