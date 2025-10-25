import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (str.matches("[a-zA-Z0-9]+")) {
            System.out.println("String is alphanumeric");
        } else {
            System.out.println("String is not alphanumeric");
        }

        scanner.close();
    }
}
