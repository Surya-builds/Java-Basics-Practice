package Basics;
import java.util.Scanner;
public class countNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;

        String  choice = "yes";

        while (choice.equals("yes")){
            System.out.println("Enter a number?");
            int num = sc.nextInt();

            if(num > 0){
                positive++;
            } else if (num < 0) {
                negative++;

            }else {
                zero++;
            }
            System.out.println("Do you want to enter more numbers ? (yes/no)");
            choice = sc.next();
        }

        System.out.println("-----Results------");
        System.out.println("Postive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        System.out.println("zeros: "+zero);
        sc.close();
    }
}