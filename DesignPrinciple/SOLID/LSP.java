package DesignPrinciple.SOLID;

import java.util.*;

public class LSP {
    public static void main(String[] args) {
        List<NotWithdrawable> depositAccount= new ArrayList<>();
        depositAccount.add(new FixedAccount());

        List<Withdrawable> withdrawAccount= new ArrayList<>();
        withdrawAccount.add(new SavingAccount());
        withdrawAccount.add( new CurrentAccount());
        Client bankClient = new Client(depositAccount,withdrawAccount);
        bankClient.process();
    }
}

abstract class NotWithdrawable {
    protected double balance;

    public abstract void deposit(double amount);
}

abstract class Withdrawable extends NotWithdrawable {
    public abstract void withdraw(double amount);

}

class FixedAccount extends NotWithdrawable {
    public void deposit(double amount) {
        balance += amount;

        System.out.println("Fixed account deposit: " + amount);
        System.out.println("Total balance: " + balance);
    }
}

class SavingAccount extends Withdrawable {
    public void deposit(double amount) {
        balance += amount;
        System.out.println("saving account deposit: " + amount);
        System.out.println("Total balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("withDraw: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("InSufficient balance");
        }
    }
}

class CurrentAccount extends Withdrawable {
    public void deposit(double amount) {
        balance += amount;
        System.out.println("saving account deposit: " + amount);
        System.out.println("Total balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("withDraw: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("InSufficient balance");
        }
    }
}
class Client{
   private  List<NotWithdrawable> depositAccount= new ArrayList<>();
   private  List<Withdrawable> withdrawAccount= new ArrayList<>();
   Client(List<NotWithdrawable> deposit,List<Withdrawable> withdrawAccount2){
    this.depositAccount=deposit;
    this.withdrawAccount=withdrawAccount2;

   }
   public void process(){
    for(NotWithdrawable acc: depositAccount){
        acc.deposit(100);

    }
    for(Withdrawable acc: withdrawAccount){
        acc.deposit(3000);
        acc.withdraw(200);
    }
   }
}
