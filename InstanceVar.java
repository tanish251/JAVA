class InstanceVar{
    int id; //Instance Variable
    String name; //Instance Variable
    
    public static void main(String[] args){
        InstanceVar m = new InstanceVar();
        m.id = 251;
        m.name = "Tanish";
        System.out.println("Name is "+ m.name +" and id is "+m.id);
    }
}