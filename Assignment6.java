import java.util.Arrays;
import java.util.Scanner;

public class Assigement6 {
//    Write a program that accepts n integers from the user (where n is also
//            provided by the user). Store the numbers in an array and write a method
//    to find and display the second largest number in the array.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Secondlar(arr));
    }
    public static int Secondlar(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

       return arr[arr.length-2];
    }
}