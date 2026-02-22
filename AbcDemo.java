class Program {
    private int a, b;
    public void setA(int a, int b) {
           this.a = a;
           this.b = b;
    }
    public int getA() {
        return a+b;
    }
}
public class AbcDemo {
    public static void main(String[] args) {
        Program obj = new Program();
        obj.setA(2, 4);
        int t = obj.getA();
        System.out.println(t);
    }
    
}
