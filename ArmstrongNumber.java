import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;
        int digits = 0;

        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        if (result == originalNumber)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");

        sc.close();
    }
}