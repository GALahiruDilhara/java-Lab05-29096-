public class CheckingAccount extends BankAccount {

    private static final double interest = 2.0/100.0;

    public CheckingAccount(int accountNumber,double balance){
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
    }

    @Override
    public double calculateInterest() {
        return (this.getBalance()*this.interest);
    }
    
}
