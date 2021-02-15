package OopClass1.EmployeesProgram8;

public class Programmer extends Employee {

    private String languages;

    public Programmer(String name, String lastName, int id,String languages) {
        super(name, lastName, id);
        this.languages=languages;

    }

    public void format(String operatingSystem){
        System.out.println(getName()+" " + operatingSystem + " is installing");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Programmer knows those languages " + languages);
    }
}
