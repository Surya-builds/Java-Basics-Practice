package Basics;

import java.util.Scanner;

public class circleCircumference {
    public static double calccircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius:");
        double radius = sc.nextDouble();

        double result = calccircumference(radius);
        System.out.println("circumference is:" + result);

        sc.close();
    }
}
