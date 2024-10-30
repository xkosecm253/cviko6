
public class Student implements Person {
    private String studentID;
    private String name;
    private String surname;
    private int age;


    public Student(String studentID, String name, String surname, int age) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public void getInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Age: " + age);
    }
}
