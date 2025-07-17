import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        int accountNumber = 1000;
        BankAccount account = null;
        while (true) {
            System.out.println(accounts.size());
            System.out.println("[1]. create new account");
            System.out.println("[2]. Deposit");
            System.out.println("[3]. Withdraw");
            System.out.println("[4]. Show account info");
            System.out.println("[5]. Exit");
            System.out.print("choose 1 to 5 : ");
            int a = input.nextInt();
            switch (a) {
                case 1:
                    input.nextLine();
                    System.out.println("******************");
                    System.out.println("what's your name?");
                    String name = input.nextLine();
                    System.out.println("------------------");
                    System.out.println("how much do you pay for first balance?");
                    double balance = input.nextDouble();
                    accountNumber++;
                    System.out.println("******************");
                    System.out.format("your account information is:\nname : %s\naccount number is : %d\nyour balance is : %.2f\n", name, accountNumber, balance);
                    System.out.println("******************");
                    account = new BankAccount(accountNumber, name, balance);
                    accounts.add(account);
                    break;
                case 2:
                    input.nextLine();
                    if(account != null){
                        System.out.println("whats your account number?");
                        int AccountNumber = input.nextInt();
                        for(BankAccount foundMember : accounts){
                            if(foundMember.getaccountNumber() == AccountNumber){
                            System.out.format("this account number is for %s\n", foundMember.getname());
                            System.out.println("------------------");
                            System.out.println("how much is your deposit?");    
                            double Amount = input.nextDouble();
                            foundMember.deposit(Amount);
                            System.out.println("Deposit successful.");
                            }
                        }   
                    }else System.out.println("no accound found yet!!!");
                    break;
                case 3:
                    input.nextLine();
                    if( account != null){
                        System.out.println("what's your account number?");
                        int AccountNumber = input.nextInt();
                        for(BankAccount foundMember : accounts){
                            if(foundMember.getaccountNumber() == AccountNumber){
                            System.out.format("this account is for %s\n", foundMember.getname());
                            System.out.println("------------------");
                            System.out.println("how much is your deposit?");    
                            double Amount = input.nextDouble();
                            foundMember.withdraw(Amount);
                            System.out.println("Withdraw successful.");
                            }
                        }
                    }
                    break;
                case 4:
                if(account != null){
                    System.out.println("--------------------------------");
                    for(int i = 1001; i <= accountNumber; i++){
                        for(BankAccount foundMember : accounts){
                            if(foundMember.getaccountNumber() == i){
                            foundMember.showInfo();
                            }
                        }
                    }
                }
                    break;
                case 5:
                    input.close();
                    System.exit(a);
                    break;
            
                default:
                    break;
            }
        }
    }
}
