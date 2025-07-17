import java.util.ArrayList;

public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance = 0;

    public BankAccount(int accountNumber, String name, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getaccountNumber(){
        return accountNumber;
    }
    public String getname(){
        return name;
    }
    public double getbalance(){
        return balance;
    }


    public boolean deposit(double Amount){
        if(Amount > 0){
        balance += Amount;
        return true;
        }else return false;
    }

    public boolean withdraw(double Amount){
        if(Amount > 0){
            if(Amount < balance){
                balance -= Amount;
                return true;
            }else return false;
        }else return false;
    }
    public void showInfo(){
        System.out.println("account name is: " + name);
        System.out.println("your accountNumber is : " + accountNumber);
        System.out.println("your balance is : " + balance + "$");
        System.out.println("--------------------------------");
    }
    

}
