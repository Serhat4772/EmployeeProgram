package OopClass1.EmployeesProgram8;

public class Employee {
    private String name;
    private String lastName;
    private int id;

    public Employee(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void showInformation(){
        System.out.println("Employee Information");
        System.out.println("Name: " + name);
        System.out.println("lastName: " + lastName);
        System.out.println("Id: " +id);
        System.out.println("Master change");
        System.out.println("End of code");
    }
}