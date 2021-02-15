package OopClass1.EmployeesProgram8;

public class Manager extends Employee{
    private int responsiblePerson;

    public Manager(String name, String lastName, int id, int responsiblePerson) {
        super(name, lastName, id);
        this.responsiblePerson=responsiblePerson;

    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Manager is responsible person number: " + responsiblePerson);
    }
    public void raise(int raiseAmount){
        System.out.println(getName() + "employees are given raise " + raiseAmount);
    }
}
