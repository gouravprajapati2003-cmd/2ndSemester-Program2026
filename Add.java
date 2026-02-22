import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a : ");
        int a = sc.nextInt();
        System.out.println("Enter value b : ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Addition of Two number is : " + c);
        sc.close();
    }
}
