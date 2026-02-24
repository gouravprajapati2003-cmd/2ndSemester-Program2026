public class TableRecursion {
    public static void main(String[] args) {
        System.out.println("Table of 3");
        print1(3);
    }
    static void print1(int n) {
        if(n==30) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print1(n+3);
    }
}
