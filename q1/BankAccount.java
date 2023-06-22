public abstract class BankAccount {

    private int accountNumber;
    private double balance;

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setAccountNumber(int value){
        this.accountNumber = value;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }

    public abstract double calculateInterest();
}
