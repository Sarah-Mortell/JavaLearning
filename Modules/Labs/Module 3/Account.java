package Module3Labs;
// modify class Account to provide method called debit that withdraws money from an Account.

public class Account {
    private int accountNumber;
    private int pin;

    private String debit;
    private double availableBalance;
    private double totalBalance;

    public Account(int var1, int var2, double var3, double var5) {
        this.accountNumber = var1;
        this.pin = var2;
        this.availableBalance = var3;
        this.totalBalance = var5;
    }

    public boolean validatePIN(int var1) {
        return var1 == this.pin;
    }

    public double getAvailableBalance() {
        return this.availableBalance;
    }

    public double getTotalBalance() {
        return this.totalBalance;
    }

    public void credit(double var1) {
        this.totalBalance += var1;
    }

    public void debit(double var1) {
        this.availableBalance -= var1;
        this.totalBalance -= var1;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}

