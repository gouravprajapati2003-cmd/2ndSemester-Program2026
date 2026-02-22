class Gourav {
    String name;
    String course;
    int rollNo;
    int age;
Gourav(String name, String  course, int rollNo, int age) {
    this.name = name;
    this.course = course;
    this.rollNo = rollNo;
    this.age =age;
}
Gourav() {

}
public void display() {
    System.out.println("Name : " + name);
    System.out.println("Course : " + course);
    System.out.println("RollNo. : " + rollNo);
    System.out.println("Age : " + age);
    System.out.println(" ");
}
}
public class Constructor {
    public static void main(String[] args) {
        Gourav g1, g2;
        g1 = new Gourav("Gourav Kumar", "MCA", 29, 22);
        g1.display();
        g2 = new Gourav();
        g2.display();
    }
    
}
