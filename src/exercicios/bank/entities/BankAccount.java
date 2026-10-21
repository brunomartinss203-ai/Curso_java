package exercicios.bank.entities;

public class BankAccount {
    private final int accountNumber;
    private String accountHolder;
    private  double balance;
    private static  final  double TAX_WITHDRAW = 5.00;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void deposit(double valueDeposit){
        balance +=valueDeposit;
    }
    public void withdraw(double valueWithdraw){
        balance -= valueWithdraw + TAX_WITHDRAW;

    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account "+
                accountNumber
                + ", Holder: "+
                accountHolder
                + ", Balance : $ "
                + String.format("%.2f",balance);

    }
}
