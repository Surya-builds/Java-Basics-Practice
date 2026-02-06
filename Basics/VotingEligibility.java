package Basics;

import java.util.Scanner;

public class VotingEligibility {
    public static boolean votingEligibility(int age){
        if(age > 18){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to check the eligiblity");
        int age = sc.nextInt();

        boolean result = votingEligibility(age);

        if(result){
            System.out.println("You're eligible to vote");
            System.out.println("You're not eligible to vote");
        }
        sc.close();
        }
    }

