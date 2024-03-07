package org.example;

public class Accounts {
    private int accountId;

    private String accountHoldername;

    public Accounts(int accountId, String accountHoldername) {
        this.accountId = accountId;
        this.accountHoldername = accountHoldername;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountHoldername() {
        return accountHoldername;
    }

    public void setAccountHoldername(String accountHoldername) {
        this.accountHoldername = accountHoldername;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountId=" + accountId +
                ", accountHoldername='" + accountHoldername + '\'' +
                '}';
    }
}
