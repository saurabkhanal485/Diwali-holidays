import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        int odd = 1; 
      
        for (int i = 1; i <= n; i++) {
            sum += odd;
            odd += 2;
        }

        System.out.println("Sum of first " + n + " odd numbers is: " + sum);

        sc.close();
    }
}
