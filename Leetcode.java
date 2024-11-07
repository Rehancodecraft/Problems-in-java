import java.util.Scanner;

public class Leetcode{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int product = 1;
        int sum = 0;
        while(number!= 0){
            int singleNumber = number % 10;
            product = singleNumber * product;
            sum = singleNumber + sum;

            number = number/10;
        }
        int difference = product - sum;
        System.out.println("Difference is : "+difference);
    }
}