public class SavingsAccount extends BankAccount {

    private static final double interest = 12.0/100.0;

    public SavingsAccount(int accountNumber,double balance){
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
    }

    @Override
    public double calculateInterest() {
        return (this.getBalance()*this.interest);
    }
    
}
