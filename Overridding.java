class A {
    int a, b, c;
    void showDetails() {
        System.out.println("I am Gourav Kumar");
    }
}
 class B extends A {
    void showDetails() {
        System.out.println("I am Prajapati Boy");
    }
}
public class Overridding {
    public static void main(String[] args) {
        A ref;
        ref = new B();
        ref.showDetails();
    }
}
