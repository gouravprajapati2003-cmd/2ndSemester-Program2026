class Abc {
    int a, b;
    Abc (int a, int b) {
        this.a = a;
        this.b = b;
    }
    Abc (Abc t) {
        this.a = t.a;
        this.b = t.b;
        
    }
}
public class Main {
    public static void main(String[] args) {
        Abc obj1 = new Abc(25, 60);
        Abc obj = new Abc(obj1);
        System.out.println(obj);
        
    }
}
