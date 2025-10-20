import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        int even = 2; 

        for (int i = 1; i <= n; i++) {
            sum += even;
            even += 2;
        }
        System.out.println("Sum of first " + n + " even numbers is: " + sum);

        sc.close();
    }
}
