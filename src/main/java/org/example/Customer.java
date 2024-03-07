package org.example;

public class Customer {
    private int customerId;
    private String customerName;

    private Accounts accounts;

    public Customer(int customerId, String customerName, Accounts accounts) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.accounts = accounts;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
