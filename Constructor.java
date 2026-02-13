
public class Constructor{
    String name;
    int age;
    int PRN;
    String DOB;
    // Constructor(){
    //     name = "";
    //     age = 0;
    //     PRN = 0;
    //     DOB = "";
    //     }
    Constructor(String n, int a, int p, String d){
        name = n;
        age = a;
        PRN = p;
        DOB = d;
    }
    void display(){
        System.out.println("Name is "+ name);
        System.out.println("Age is "+ age);
        System.out.println("PRN is "+ PRN);
        System.out.println("DOB is "+ DOB);
        }
    
    public static void main(String[] args){
        Constructor m = new Constructor("Tanish", 18, 251, "17 Dec 2006");
        m.display();
    }
}