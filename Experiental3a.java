class Staff{
    int staffId;
    String name;
    Staff(int id, String n){
        staffId = id;
        name = n;
    }
    void displayStaffDetails(){
        System.out.println("Staff id is: "+ staffId);
        System.out.println("Name is: "+ name);
    }
}
class TeachingStaff extends Staff{
    String subject;

    public TeachingStaff(int id, String n, String subj) {
        super(id, n);
        subject = subj;
    }
    void displayTeachingInfo(){
        System.out.println("Subject is: "+ subject);
        }
}
class Non_Teaching_staff extends Staff{
    String Department;
    public Non_Teaching_staff(int id, String n, String dept) {
        super(id, n);
        Department = dept;
    }
    void displayDepartmentInfo(){
        System.out.println("Department is: "+ Department);
    }
}
class Experiental3a{
    public static void main(String[] args) {
        TeachingStaff ts = new TeachingStaff(251, "Tanish", "Java");
        ts.displayStaffDetails();
        ts.displayTeachingInfo();

        System.out.println("---------");

        Non_Teaching_staff nts = new Non_Teaching_staff(250, "Purnav", "CSE");
        nts.displayStaffDetails();
        nts.displayDepartmentInfo();
    }
}