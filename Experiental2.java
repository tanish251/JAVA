class Person{
    String name;
    int age;
    Person(String n, int a){
        name = n;
        age = a;
    }
    void display_Person(){
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+ age);
    }
}
class Student extends Person{
    int StudentId;
    Student(String n, int a, int id){
        super(n, a);
        StudentId = id;
    }
    void display_Student(){
        System.out.println("Student id is: " + StudentId);
    }
}
class GraduateStudent extends Student{
    String ResearchTopic;
    GraduateStudent(String n, int a, int id, String topic){
        super(n, a, id);
        ResearchTopic = topic;
    }
    void display_Full(){
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+ age);
        System.out.println("Id is: "+ StudentId);
        System.out.println("Research Topic is: "+ ResearchTopic);

    }
}
class Experiental2{
    public static void main(String[] args) {
        GraduateStudent gs = new  GraduateStudent("Tanish", 19, 251, "JAVA");
        gs.display_Person();
        System.out.println("----------");
        gs.display_Student();
        System.out.println("----------");
        gs.display_Full();
    }
}