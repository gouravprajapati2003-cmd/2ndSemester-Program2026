public class Student1 {
    String name = "Gourav Kumar";
    int age = 22;
    public String toString(){
        return "Details{name = "+name+", age = "+age+"}";
    }
    public static void main(String[] args) {
        Student1 obj = new Student1();
        System.out.println(obj);
    }

}
