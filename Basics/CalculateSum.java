import java.util.Scanner;
public class CalculateSum {
    public static void calculatesum(int sum) {
        System.out.println("Sum of odd numbers: " + sum);
    }

    public static void main(String args[]) {
        System.out.println("Whats the n value ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                sum = sum + i;
            }
        }

        calculatesum(sum);
        sc.close();
    }
}