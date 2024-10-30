
public class Employee implements Person {
    private String name;
    private String surname;
    private int age;


    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public int yearsUntilRetirement() {
        return 65 - age;
    }


    @Override
    public void getInfo() {
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Age: " + age);
        System.out.println("Years until retirement: " + yearsUntilRetirement());
    }
}
