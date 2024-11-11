// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Problem2{
    public static void main(String[] args) {
        //This is class having and object input
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.next();
        System.out.println("Welcom dear "+name+ ".We hope you are hale and hearty.");
    }
}