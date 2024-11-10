import java.util.Scanner;

public class Assigement7
{
//    Write a program that takes an integer input n and prints a pyramid of
//    numbers up to n rows, where each row has an increasing count of
//    numbers. For example, if n = 4, the output should be:
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}