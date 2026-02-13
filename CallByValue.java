class CallByValue{
    void modifyValue(int x){
        x = x + 10;
        System.out.println(x);
    }
    public static void main(String[] args){
        int a = 5;
        CallByValue obj = new CallByValue();
        obj.modifyValue(a);
        System.out.println(a);
    }
}
// modification is only made in that fuction not in the entire program 
// but if i print inside that function than it is changed