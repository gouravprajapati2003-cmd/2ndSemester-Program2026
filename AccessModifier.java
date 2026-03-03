class Person {
    private String name;
    public void SetName(String name) {
        this.name = name;
    }
    public String getname() {
         return name;
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.SetName("Gourav Kumar");
        String N = obj.getname();
        System.out.println("Your Name is : "+ N);
    }
}
