import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " distinct numbers from 0 to " + n + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
      
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
