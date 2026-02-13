abstract class Employee {
    int empId;
    String name;
    float baseSalary;

    Employee(int id, String n, float bs) {
        empId = id;
        name = n;
        baseSalary = bs;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    float bonus;

    FullTimeEmployee(int id, String n, float bs, float b) {
        super(id, n, bs);
        bonus = b;
    }

    void calculateSalary() {
        float total = baseSalary + bonus;
        System.out.println("Full Time Salary: $" + total);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    float ratePerHour;

    PartTimeEmployee(int id, String n, int hw, float rph) {
        super(id, n, 0);
        hoursWorked = hw;
        ratePerHour = rph;
    }

    void calculateSalary() {
        float total = hoursWorked * ratePerHour;
        System.out.println("Part Time Salary: $" + total);
    }
}

class ContractEmployee extends Employee {
    float contractAmount;

    ContractEmployee(int id, String n, float ca) {
        super(id, n, 0); 
        contractAmount = ca;
    }

    void calculateSalary() {
        System.out.println("Contract Salary: $" + contractAmount);
    }
}

class Experiental4b {
    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee(101, "Tanish", 30000, 5000);
        f1.displayEmployeeInfo();
        f1.calculateSalary();

        System.out.println("-----------");

        PartTimeEmployee p1 = new PartTimeEmployee(102, "Rohan", 80, 300);
        p1.displayEmployeeInfo();
        p1.calculateSalary();

        System.out.println("-----------");

        ContractEmployee c1 = new ContractEmployee(103, "Anil", 45000);
        c1.displayEmployeeInfo();
        c1.calculateSalary();
    }
}
