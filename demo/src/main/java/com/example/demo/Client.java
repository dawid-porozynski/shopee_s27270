package com.example.demo;

public class Client {


    private int id;
    private int balance;


    public Client(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
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
                "\nName: " + getId() +
                "\nBalance: " + getBalance() + "$";
    }

}
