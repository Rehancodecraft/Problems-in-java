import java.util.Scanner;

public class Problem6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= number){
            int temp = b;
            b = a+b;
            a = temp;
            count ++;

            System.out.println(b);
        }
    }
}