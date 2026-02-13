import java.util.Scanner;
class Employee{
    String name;
    int id;
    float salary;
    
    Employee(String n, int i, float s){
        name  = n;
        id = i;
        salary = s;
    }
    void Display_Employee_Details(){
        System.out.println("Name is: "+ name);
        System.out.println("Id is: "+ id);
        System.out.println("Salary is: "+ salary);
    }
}
class Manager extends Employee{
    float Bonus;
    Manager(String n, int i, float s, float b){
        super(n,i,s);
        Bonus  = b;
    }
    void Calculate(){
        salary = salary + Bonus;
    }
    void display(){
        System.out.println("Name is: "+ name);
        System.out.println("Id is: "+ id);
        System.out.println("New Salary is: "+ salary);
    }
}
class Experiental1{
    public static void main(String[] args){
        Manager m = new Manager("Tanish", 251, 1200000, 9999);
        m.Calculate();
        m.display();
    }    
}


