// Take in two numbers and an operator (+, -, *, /) and calculate the value.

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter operator:  ");
        char op = input.next().trim().charAt(0);
        System.out.println("Enter 2nd number: ");
        float num2 = input.nextFloat();
        float ans = 0;
        switch (op) {
            case '+':
                ans = num1 + num2;
                System.out.println(ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println("ans");
                break;
            case '/':
                ans = num1 / num2;
                System.out.println(ans);
                break;
            default:
                System.out.println("Enter a valid operation");
        }
    }
}