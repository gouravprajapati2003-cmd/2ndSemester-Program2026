class Person {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class NameDemo {
    public static void main(String[] args) {
        Person obj = new Person();
        // obj.name = "Hello";
        obj.setName("Gourav Kumar");
        String t = obj.getName();
        System.out.println("Your name is : " + t);
    }
}
