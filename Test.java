package OopClass1.EmployeesProgram8;
/*
Employee program
we need a Employee class as a ArrayListIntro class

we need subclass from Employee class as a programmer class
we need subclass from Employee class as a manager class
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Employee program......");
        String operations = "Operations...\n"
                + "1.Programmer Operations\n"
                + "2.Manager Operation\n"
                + "Exiting the program click the 'q' ";
        System.out.println("***************************************");
        System.out.println(operations);
        System.out.println("***************************************");

        while (true) {
            System.out.print("Select Operations:");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Exiting the program");
                break;

            } else if (operation.equals("1")) {
                Programmer programmer = new Programmer("Jack ", "Hunt", 567, "Java, Phyton");
                String programmer_Operation = "Manager Operation\n"
                        + "1.Format\n"
                        + "2.Show information\n"
                        + "Exiting the program click the 'q' ";
                System.out.println(programmer_Operation);
                while (true) {
                    System.out.print("Select Operations:");
                    String yOperation = scanner.nextLine();

                    if (yOperation.equals("q")) {
                        System.out.println("Exiting from programmer operations");
                        break;
                    } else if (yOperation.equals("1")) {
                        System.out.print("operating_System: ");
                        String operating_System = scanner.nextLine();
                        programmer.format(operating_System);

                    } else if (yOperation.equals("2")) {
                        programmer.showInformation();

                    } else {
                        System.out.println("invalid programmer operation");
                    }

                }


            } else if (operation.equals("2")) {
                Manager manager = new Manager("Mustafa ", "Coskun", 123, 10);
                String manager_Operation = "Manager Operation\n"
                        + "1.raise\n"
                        + "2.Show information\n"
                        + "Exiting the program click the 'q' ";
                System.out.println(manager_Operation);
                while (true) {
                    System.out.print("Select Operations:");
                    String y_operation = scanner.nextLine();

                    if (y_operation.equals("q")) {
                        System.out.println("Exiting from manager operations");
                        break;
                    } else if (y_operation.equals("1")) {
                        System.out.print("How much raise do you want: ");
                        int raiseAmount = scanner.nextInt();
                        scanner.nextLine();
                        manager.raise(raiseAmount);

                    } else if (y_operation.equals("2")) {
                        manager.showInformation();

                    } else {
                        System.out.println("invalid manager operation....");
                    }
                }
            } else {
                System.out.println("invalid Operation");

            }
        }
    }
}