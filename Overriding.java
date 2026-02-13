class BankAccount{
    double getInterestRate(){
        return 0.0;
    }
}
class SavingsAccount extends BankAccount{
    double getInterestRate(){
        return 4.5;
    }
}
class CurrentAccount extends BankAccount{
    double getInterestRate(){
        return 3.0;
    }
}

class Overriding{
    public static void main(String[] args){
        BankAccount sa = new SavingsAccount();
        BankAccount ca = new CurrentAccount();
        System.out.println(sa.getInterestRate());
        System.out.println(ca.getInterestRate());
    }
}