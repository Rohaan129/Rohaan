package ATMProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance = 0;
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }



    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }
    //perform Functions
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance-amount);
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance-amount);
        return checkingBalance;
    }
    public double calcCheckingDeposit(double amount){
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingBalance = savingBalance + amount;
        return savingBalance;
    }
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance"+moneyFormat.format(checkingBalance));
        System.out.println("Amount You want to withdraw for checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance -amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Balance Account:" + moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Balance Cant be negative"+"\n");

        }
    }
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance:"+moneyFormat.format(checkingBalance));
        System.out.println("Amount You want to deposit from checking Account: ");
        double amount = input.nextDouble();
        if((checkingBalance+amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Balance Cannot be negative"+"\n");
        }
    }
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance"+moneyFormat.format(checkingBalance));
        System.out.println("Amount You want to withdraw for Saving Account: ");
        double amount = input.nextDouble();

        if((checkingBalance -amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Saving Balance Account:" + moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Balance Cant be negative"+"\n");

        }
    }
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance:"+moneyFormat.format(checkingBalance));
        System.out.println("Amount You want to deposit from Saving Account: ");
        double amount = input.nextDouble();
        if((checkingBalance+amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Saving Account Balance: "+moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Balance Cannot be negative"+"\n");
        }
    }



}

