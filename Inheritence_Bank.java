// import java.util.Scanner;

// class Bank {
//     Scanner sc = new Scanner(System.in);
//     int accNo;
//     float balance;

//     void getData() {
//         System.out.print("Enter Account No: ");
//         accNo = sc.nextInt();
//         System.out.print("Enter Balance: ");
//         balance = sc.nextFloat();
//     }

//     void display() {
//         System.out.println("Account number: " + accNo);
//         System.out.println("Balance: " + balance);
//     }
// }

// class SavingsAcc extends Bank {
//     float credit;
//     float debit;

//     void credit() {
//         System.out.print("Amount to credit: ");
//         credit = sc.nextFloat();
//         balance = balance + credit;
//         System.out.println("Amount Credited !!");
//     }

//     void debit() {
//         System.out.print("Amount to debit: ");
//         debit = sc.nextFloat();
//         if (debit > balance) {
//             System.out.println("Insufficient Balance !!");
//         } else {
//             balance = balance - debit;
//             System.out.println("Amount Debited !!");
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         SavingsAcc a1 = new SavingsAcc();
//         a1.getData();
//         a1.display();
//         a1.credit();
//         a1.display();
//         a1.debit();
//         a1.display();
//     }
// }
