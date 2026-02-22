// this is constructor program
class Student {
    int rollno;
    String name;
    Student (int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public void display() {
        System.out.println(rollno);
        System.out.println(name);
    }
}
 public class First {
    public static void main(String[] args) {
        Student p, q, r, s, t;
        p = new Student(101, "Gourav kumar");
        q = new Student(102, "Mohit kumar");
        r = new Student(103, "Amit kumar");
        s = new Student(104, "Prashant Kumar");
        t = new Student(105, "Ravi Kumar");
        p.display();
        q.display();
        r.display();
        s.display();
        t.display();
    }
}