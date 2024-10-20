package bank;

public abstract class Account {
    private final int accountNumber;
    private static int counter;
    private double balance;

    public Account() {
        counter++;
        this.accountNumber = counter;
    }

    public abstract AccountType getAccountType();


    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient Funds");
            System.out.println(" ");
        } else if (getAccountType() == AccountType.Checking) {
            this.balance -= amount + 5;
            System.out.println("You withdraw: " + amount);
            System.out.println("5$ transaction fee applied");
        } else if (getAccountType() == AccountType.Savings) {
            this.balance -= amount + 10;
            System.out.println("You withdraw: " + amount);
            System.out.println("10$ transaction fee applied");
            System.out.println(" ");
        }
        System.out.println("Balance: $" + this.balance);
        System.out.println(" ");
    }

    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Invalid amount");
            System.out.println(" ");
        }else if(this.balance > 1000 || amount > 1000){
            this.balance += amount + (amount * 0.10);
            System.out.println("You deposit: $" + amount);
            System.out.println("10% interest applied.");
        }else{
            this.balance += amount + (amount * 0.05);
            System.out.println("You deposit: " + amount);
            System.out.println("5% interest applied.");
        }
        System.out.println("Balance: $" + this.balance);
        System.out.println(" ");
    }

    public double getInterestRate(double balance, double amount){
        if (balance > 1000){
            return amount * 0.10;
        }else{
            return amount * 0.05;
        }
    }

    public double getTransactionFee(AccountType accountType){
        if (accountType == AccountType.Checking){
            return 5.0;
        }else{
            return 10.0;
        }
    }

    public String getAccountInfo(){
        return "Account number: " + accountNumber + "\n" +"Balance: $" + balance;
    }

    public static void printTotalNumberOfAccounts(){
        System.out.println(counter);
    }


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getCounter() {
        return counter;
    }
}
