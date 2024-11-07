import java.util.Scanner;

public class Problem7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int reverse = 0;
        while (number != 0){
            int temp = number % 10;
            reverse = reverse * 10 + temp;
            number = number / 10;
        }
        if(reverse == originalNumber){
            System.out.println("Your number is Pelindrome");
        }
        else{
            System.out.println("Your number is not Pelindrome");
        }
    }
}