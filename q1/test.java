public class test {

    public static void main(String args[]){
        SavingsAccount savingaccount = new SavingsAccount(0, 20_000_000);
        CheckingAccount checkingaccount = new CheckingAccount(0, 1_000_000);
        System.out.println("Interest for saving account:\t"+savingaccount.calculateInterest());
        System.out.println("Interest for checking account:\t"+checkingaccount.calculateInterest());
    }
    
}
