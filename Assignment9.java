import java.util.Scanner;

public class Assigement9 {
//    Implement a program that accepts an integer input n and prints Floyd's
//    Triangle up to n rows. Floyd’s Triangle has consecutive numbers starting
//    from 1. For example, if n = 4, the output should be:
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}