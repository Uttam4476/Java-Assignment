# Java-Assignment1

//    Write a Java program that takes an integer input from the user and
//    calculates the factorial of the number. Then, write a method to calculate
//    the sum of the digits of this factorial. For example, if the user enters 5,
//    calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3).
import java.util.Scanner;
public class Assigement1 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Number");
            int n=sc.nextInt();
            int sum=1;
            for(int i=2;i<=n;i++){
                sum=sum*i;
            }
        System.out.println("Factorial of a number="+sum);

          noDigit(sum);

    }
    public static void noDigit(int n){
        int sum=0;
        while(n!=0){
            int a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.println("The sum of digits are="+sum);
    }

}
