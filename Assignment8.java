import java.util.Scanner;

public class Assigement8 {
//    Write a program that takes an integer input n and prints an inverted
//    triangle of numbers. For example, if n = 5, the output should be:
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=5;i>=1;i--){
            int t=i;
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t--;
            }
            System.out.println();

        }
    }
}