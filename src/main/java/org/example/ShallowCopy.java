package org.example;

public class ShallowCopy {

    public static void main(String[] args) {
        Accounts accounts = new Accounts(123,"Praneeth");
        Customer customer = new Customer(123,"Chakravarthi",accounts);

        System.out.println("Before copy "+customer);
        System.out.println("Before copy "+customer.hashCode());

        Customer shallowCustomer = customer;

        shallowCustomer.getAccounts().setAccountHoldername("PrajnaSri");

        System.out.println("Before copy "+shallowCustomer);
        System.out.println("Before copy "+shallowCustomer.hashCode());





    }

}
