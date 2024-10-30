
public class Main {
    public static void main(String[] args) {
        Student student = new Student("12345", "Peter", "Novak", 20);
        Employee employee = new Employee("Jana", "Kovacova", 45);


        student.getInfo();
        System.out.println();
        employee.getInfo();
    }
}
