package Basics;

import java.util.Scanner;

public class AverageCalculator {
    public static  void calculateaverage(int a, int b, int c){
        double avg = (a+b+c) / 3.0;
        System.out.println("The average marks of three subjects is "+avg);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks? ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calculateaverage(a, b, c);

    }
}
