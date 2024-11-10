import java.util.Scanner;

public class Assigement4 {
//    Accept a string input from the user and check if it’s a palindrome (a word
//that reads the same forwards and backwards). Create a method to
//    reverse the string and compare it to the original to determine if it’s a
//    palindrome.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String s=sc.nextLine();
   Check(s);

}
public static void Check(String s){
    String s1="";
    for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        s1+=ch;
    }
    if(s.equals(s1)){
        System.out.println("Plaindrome");
    }else
        System.out.println("Not a Palindrome");


}

}