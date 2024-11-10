import java.sql.SQLOutput;
import java.util.Scanner;

public class Assigement2 {

//    Create a program that accepts 10 integers from the user, stores them in
//    an array, and then prints only the prime numbers in that array.
//    Implement a separate method to check if a number is prime.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 integer  elemnets in an array");
    int[] arr=new int[10];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Prime no are: ");

    for(int i:arr){
        int fact=0;
        for(int j=2;j<=i;j++){
            if(i%j==0 ){
                fact++;
            }
        }
        if(fact==1){
            System.out.print(i+" ");
        }
    }
}
}