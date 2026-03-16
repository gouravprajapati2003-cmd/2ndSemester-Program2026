public class Employee {
    int id = 101;
    int s;
    public int hashCode() {
        return id *5;
    }
    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(obj.hashCode());
    }
}
