class SumAdd {
    void add(int a, int b) {
        int c = a*b;
        System.out.println(c);
    }
    void add(int a, float b) {
       float c = a+b;
        System.out.println(c);
    }
}
public class Overloading {
    public static void main(String[] args) {
        SumAdd t = new SumAdd();
        t.add(2, 3);
        t.add(3, 03.5f);
    }
}
