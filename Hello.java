public class Hello {
   public static void main(String[] args) {
    System.out.println("Welcome");
    Print1(1);
    System.out.println("Thanks");
} 
static void Print1(int n) {
    if(n==5) {
        return;
    }
    System.out.println(n);
    Print1(n+1);
}
}

