package org.example;

public class DeepCopy {

    public static void main(String[] args) {

        Accounts accounts = new Accounts(123,"Praneeth");
        Customer customer = new Customer(123,"Chakravarthi",accounts);

        System.out.println("Before Deep copy "+customer);
        System.out.println("Before Deep copy "+customer.hashCode());

        Customer deepCopy = new Customer(customer.getCustomerId(),customer.getCustomerName(),
                new Accounts(customer.getAccounts().getAccountId(),
                        customer.getAccounts().getAccountHoldername()));
        deepCopy.setCustomerName("PrajaSri");
        deepCopy.getAccounts().setAccountHoldername("PrajnaSri diguvapalem");

        System.out.println("After Deep copy "+deepCopy);
        System.out.println("After Deep copy "+deepCopy.hashCode());


    }
}
