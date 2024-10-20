package bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public void printAllCustomersAccountInfo(){
        for (Customer customer : customers) {
            System.out.println("Account type: " + customer.getAccount().getAccountType() + " Account");
            System.out.println("Account Number : " + customer.getAccount().getAccountNumber());
            System.out.printf("Balance $" + "%.2f", customer.getAccount().getBalance());
            System.out.println(" \n ");
        }
    }
}
