package Basics;
import java.util.Scanner;
public class GreaterNumber {

    public static int greaterNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to compare:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = greaterNumber(a, b);

        if (a == b) {
            System.out.println("Both the numbers are equal");
        } else {
            System.out.println(result + " is the greater value.");
        }

        sc.close();
    }
}