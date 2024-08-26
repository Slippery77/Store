package test.Store;

public class SavingAccount extends BaseAccount{
    private Card c;
    private double amount = 0;
    private String name;
    public SavingAccount(FixedSalary fs){
        fs.getFirstname();
        fs.getLastname();
        fs.getSecurityid();
        fs.getSalary();
    }

    public boolean deposit(double amount){
        this.amount = this.amount+amount;
        return true;
    }
    public boolean withdraw(double amount){
        if(amount<=this.amount){
            this.amount -= amount;
            return true;
        }
        return false;
    }
}