import java.util.Scanner;

public class Fact {
    public static int factorial(int num){
     if(num<2){
         return 1;
     }else{
         return  num*factorial(num-1);
     }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to calculate factorial");
        int num = sc.nextInt();
        int result=factorial(num);
        System.out.println("factorial is: "+result);
    }
}
