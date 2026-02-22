class Test {
    int k;
    Test(int p) {
        System.out.println("Parameter int");
        k = p;
    }
    Test(short p) {
        System.out.println("Parameter short");
        k = p;
    }
    Test(byte p) {
        System.out.println("Parameter byte");
        k = p;
    }
    public void display() {
        System.out.println(k);
    }
}
public class Practice 
{
    public static void main(String[] args) {
        int k = 50; 
        Test p = new Test(k);
        p.display();
        short a = 56;
        Test p1 = new Test(a);
        p1.display();
        byte b = 10;
        Test p2 = new Test(b);
        p2.display();
    }
}