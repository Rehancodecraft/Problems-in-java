// Write a program to print whether a number is even or odd, 
// also take input from the user.
import java.util.Scanner;
public class Problem1 {

    public static void main(String[] args) {
        int num1;
        // This is class for taking input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        num1 = input.nextInt();
        // here wer are adding conditions to check it is even or odd
        if(num1 % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
