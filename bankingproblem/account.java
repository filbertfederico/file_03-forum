package bankingproblem;

public class account {
    private double balance;

    public account (double b){
        this.balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "account [balance=" + balance + "]";
    }
    
}
