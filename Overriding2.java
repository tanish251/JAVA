class Animal{
    void make_sound(){
        System.out.println("Animal Makes Sound");
    }
    void sleep(){
        System.out.println("Animal Sleeps");
    }
}
class Dog extends Animal{
    void make_sound(){
        System.out.println("Dog Makes Sound");
    }
    void sleep(){
        System.out.println("Dog Sleeps");
    }
}
class Cat extends Animal{
    void make_sound(){
        System.out.println("Cat Makes Sound");
    }
    void sleep(){
        System.out.println("Cat Sleeps");
    }
}
class Overriding2{
    public static void main(String[] args){
        Animal d = new Dog();
        Animal c = new Cat();

        d.make_sound();
        d.sleep();
        c.make_sound();
        c.sleep();

    }




}