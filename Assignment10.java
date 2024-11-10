import java.util.Scanner;

public class Assigement10 {
//    Take a string input from the user and a character to search for. Write a
//    method to count the occurrences of the character in the string and return
//    the count. Then display the count to the user.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String s= sc.nextLine();
    System.out.println("write the character to search for");
    char ch= sc.next().charAt(0);
    System.out.println("No of occurence="+count(s,ch));
}
public static int count(String s,char ch){
    int count=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==ch){
            count++;
        }
    }
    return count;
}
}