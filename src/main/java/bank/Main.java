package bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();


        Checking checkingAccount1 = new Checking();

        Customer customer1 = new Customer("Bubbles", "Murphy", checkingAccount1);

        bank.addCustomer(customer1);

        checkingAccount1.deposit(2000);
        checkingAccount1.withdraw(100);
        checkingAccount1.withdraw(50);
        checkingAccount1.deposit(60);
        checkingAccount1.deposit(-60);


        Savings savings = new Savings();

        Customer customer2 = new Customer("Rich", "Murphy", savings);

        bank.addCustomer(customer2);

        savings.deposit(500);
        savings.withdraw(1000000);
        savings.withdraw(100);


        Checking checkingAccount2 = new Checking();

        Customer customer3 = new Customer("Reagen", "Murphy", checkingAccount2);

        bank.addCustomer(customer3);

        checkingAccount2.deposit(1000);
        checkingAccount2.withdraw(100);


        bank.printAllCustomersAccountInfo();

        //Account Type: Checking Account
        //    Account Number: 1
        //    Balance: $2106.00
        //
        //
        //    Account Type: Savings Account
        //    Account Number: 2
        //    Balance: $415.00
        //
        //    Account Type: Checking Account
        //    Account Number: 3
        //    Balance: $945.00

        Account.printTotalNumberOfAccounts(); //3


    }
}
