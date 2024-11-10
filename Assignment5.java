import java.util.Arrays;
import java.util.Scanner;

public class Assigement5 {
//    Write a program that takes an integer input n and stores the first n terms
//    of the Fibonacci sequence in an array. Then, print the array. For example,
//if the user enters 7, store and display the first 7 terms of the Fibonacci
//    sequence: 0, 1, 1, 2, 3, 5, 8.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int n=sc.nextInt();
    int[] arr=new int[n];
    arr[0]=0;
    arr[1]=1;

    for(int i=2;i<n;i++){
        arr[i]=arr[i-1]+arr[i-2];
    }
    System.out.println("Fibonacci series are"+ Arrays.toString(arr));

//    int a=0;int b=1;
//    if(n==1){
//        System.out.print(a+" ");
//    }else if(n==2){
//        System.out.print(a+" ");
//        System.out.print(b+" ");
//    }
//    else{
//        System.out.print(a+" ");
//        System.out.print(b+" ");
//        int sum=0;
//        for(int i=1;i<=n-2;i++){
//            sum=a+b;
//            System.out.print(sum+" ");
//            a=b;
//            b=sum;
//        }
//    }

}
}