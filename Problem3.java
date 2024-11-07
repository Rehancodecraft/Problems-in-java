// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        int principal = input.nextInt();
        System.out.print("For how much time(years) you borrowed: ");
        int time = input.nextInt();
        System.out.print("Enter rate(%) of Interest per year: ");
        int rate = input.nextInt();
        int interest = (principal*rate*time)/100;
        System.out.println("Interest: "+interest);



    }
}