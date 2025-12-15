import java.util.*;
abstract class Bank{
    String name;
    int accNo;
    double balance;
    void read(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Account No: ");
        accNo = sc.nextInt();
        System.out.print("Balance: ");
        balance = sc.nextDouble();
    }
    void display(){
        System.out.println("Name: " + name +
                           "\tAccount: " + accNo +
                           "\tBalance: " + balance);
    }
    abstract double calcInt();
}
class sbi extends Bank{
    double calcInt(){return balance*0.65;}
}
class rbi extends Bank{
    double calcInt(){return balance*0.75;}
}
class icici extends Bank{
    double calcInt(){return balance*0.85;}
}
class Prog6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank[] banks = {
            new sbi(),
            new rbi(),
            new icici()
        };
        for(Bank b : banks){
            System.out.println("enter deets");
            b.read();
        }
        for(Bank b : banks){
            System.out.println("deets");
            b.display();
            System.out.println("interest earned: "+b.calcInt());
        }
    }
}