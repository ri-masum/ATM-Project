package masum;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    Scanner input =new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###.##0.00");
    public int customerNumber;


    //set cumstomer number
    public int setcumtomerNumner(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;

    }

    //get customer number
    public int getCustomerNumber(){
        return customerNumber;
    }

    //set the pin number
    public int setPinNumber(int pinNumber)
    {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    /* get the pin number */

    public int getPinNumber() {
        return pinNumber;
    }

    /* get checking account balance */

    public double getCheckingBalance() {
        return checkingBalance;
    }

    /* get saving account balance*/

    public double getSavingBalance(){
        return savingBalance;
    }

    /*calculate checking Account withdrawal*/

    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    /* calculate saving account withdrawal */

    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    /* calculate checking account deposit*/

    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    /* claculate saving account deposit */

    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    /* Customer Checking  Amount Withdraw input */

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.println("Amount ypu want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    /* Customer Saving Account Withdraw input */

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " +moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance: " + savingBalance + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    /* Customer Checking Account Deposit input */

public void getCheckingDepositInput() {
    System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
    System.out.println("Amount you want to deposit from Checking Account: ");
    double amount = input.nextDouble();

    if ((checkingBalance + amount) >= 0) {
        calcCheckingDeposit(amount);
        System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
    } else {
        System.out.println("Balance cannot be negative." + "/n");
    }
}

    /* Customer Saving  Account Deposit input */

    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "/n");
        }
    }

    private int customerNumber;
    private  int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
}



