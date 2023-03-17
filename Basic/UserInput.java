import java.util.Scanner;

public class UserInput {
 public static void main(String[] args) {
    
    int myFirstNumber;
    int mySecondNumber;
    int result;
// below in will not give you any error

    Scanner in = new Scanner(System.in);
    System.out.println("Enter number 1: ");
    myFirstNumber = in.nextInt();
    System.out.println("Enter number 2: ");
    mySecondNumber = in.nextInt();

    System.out.println("Your added value is ");
    result = myFirstNumber + mySecondNumber;

    System.out.println(result);


 }   
}
