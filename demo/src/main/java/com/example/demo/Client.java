package com.example.demo;



public class Client {


    private String customerName;
    private int balance;


    public Client(String customerName, int balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getBalance() {
        return balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    public void withdraw(double amount) {
        balance -= amount;
    }
    @Override
    public String toString() {
        return "Customer" +
                "\nName: " + getCustomerName() +
                "\nBalance: " + getBalance() + "$";
    }

}
