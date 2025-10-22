import java.util.Scanner;

public class GcdLcm {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcdValue);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcmValue);

        sc.close();
    }
}
