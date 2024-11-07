import java.util.Scanner;
public class Problem5{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amount in Rupees: ");
        int rupees = input.nextInt();
        double dollars = rupees/270d;
        System.out.println("Your Amount in Dollars is  "+ dollars);
        input.close();
    }
}