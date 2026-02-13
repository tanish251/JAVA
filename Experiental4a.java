abstract class FoodOrder{
    int OrderId;
    String CustomerName;

    FoodOrder(int id, String cn){
        OrderId = id;
        CustomerName = cn;
    }
    void displayOrderDetails(){
        System.out.println("Order ID: "+ OrderId);
        System.out.println("Customer Name is: "+ CustomerName);
    }
    abstract void CalculateBill();
}

class DineInOrder extends FoodOrder{
    int tableNumber;
    float service_charge;
    float amount;
    
    DineInOrder(int id, String cn, int tn, float amt, float sc) {
        super(id, cn);
        tableNumber = tn;
        amount = amt;
        service_charge = sc;
    }
    
    void CalculateBill(){
        float total = amount + service_charge;
        System.out.println("Dine in Bill is: $" + total);
    }
}
class TakeAwayOrder extends FoodOrder{
    float packing_charge;
    float amount;
    
    TakeAwayOrder(int id, String cn, float amt, float pc){
        super(id, cn);
        amount = amt;
        packing_charge = pc;
    }
    
    void CalculateBill(){
        float total = amount + packing_charge;
        System.out.println("Take away Bill is: $" + total);
    }
}
class OnlineOrder extends FoodOrder{
    float delivery_charge;
    float amount;

    OnlineOrder(int id, String cn, float amt, float dc){
        super(id, cn);
        amount = amt;
        delivery_charge = dc;
    }
    
    void CalculateBill(){
        float total = amount + delivery_charge;
        System.out.println("Delivery Bill is: $" + total);
    }
}

class Experiental4a{
    public static void main(String[] args) {
        DineInOrder dio = new DineInOrder(251, "Tanish", 12, 5409, 120);
        dio.displayOrderDetails();
        dio.CalculateBill();
        
        System.out.println("-------");

        TakeAwayOrder tao = new TakeAwayOrder(250, "Purnav", 1428, 230);
        tao.displayOrderDetails();
        tao.CalculateBill();

        System.out.println("-------");
        
        OnlineOrder od = new OnlineOrder(123, "Anil",10409, 450);
        od.displayOrderDetails();
        od.CalculateBill();
    }
}