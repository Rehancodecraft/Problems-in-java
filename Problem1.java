// Write a program to print whether a number is even or odd, 
// also take input from the user.
import java.util.Scanner;
public class Problem1 {

    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        num1 = input.nextInt();
        if(num1 % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
