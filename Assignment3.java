import java.util.Scanner;

public class Assigement3 {

//    Build a menu-driven calculator that performs addition, subtraction,
//    multiplication, or division based on the user's choice. Use if-else
//    statements to determine the operation.
//    Keep prompting the user to perform another operation until they choose
//    to exit.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int e=1;
        while(true) {
            System.out.println();
            System.out.println("Choose your choice to be performed and enter choice no");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Exit");
            int choice = sc.nextInt();
               if(choice==5){
                   break;
               }
            System.out.println("Enter numbers to perform calculation");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (choice == 1) {
                System.out.println("Addition of two number=" + (a + b));
            } else if (choice == 2) {
                System.out.println("Substraction of two number=" + (a - b));
            } else if (choice == 3) {
                System.out.println("Multiplication of two number=" + (a * b));
            } else {
                if (b != 0)
                    System.out.println("Division of two number=" + (a / b));
                else
                    System.out.println("enter valid number to divide");
            }
        }

        System.out.println("Thank you and have a nice day!");

    }
}