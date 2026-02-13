interface Discount{
    void calculateDiscount();
}
class FestivalDiscount implements Discount{
    int disc;
    float amount;
    FestivalDiscount(int d, float amt) {
        disc = d;
        amount = amt;
    }
    public void calculateDiscount(){
        float finalAmount = amount - (amount * disc / 100.0f);
        System.out.println("Final Amount After Dicount is: " + finalAmount);
    }
    
}
class SeasonalDiscount implements Discount{
    int disc;
    float amount;
    SeasonalDiscount(int d, float amt) {
        disc = d;
        amount = amt;
    }
    public void calculateDiscount(){
        float finalAmount = amount - (amount * disc / 100.0f);
        System.out.println("Final Amount After Dicount is: " + finalAmount);
    }
    
}
class Experiental5b{
    public static void main(String[] args) {
        SeasonalDiscount sd = new SeasonalDiscount(5, 12000);
        sd.calculateDiscount();

        FestivalDiscount fd = new FestivalDiscount(20, 50050);
        fd.calculateDiscount();
    }
}