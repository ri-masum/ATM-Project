package masum;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    Scanner input =new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###.##0.00");
    private int customerNumber;


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
    public int setPinNumber(int pinNumber);{
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

    public double calcSavingWithdraw(double amount) {
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
    /*Customer Checking Account Withdraw Input*/
    public  void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance : "+moneyFormat.format(checkingBalance));
        System.out.println("Ammount you want to withdraw from Checking Account :");
        double ammount =input.nextDouble();
        if ((checkingBalance- ammount)>=0){
            calcCheckingWithdraw(ammount);
            System.out.println("New checking account balance:"+moneyFormat.format(check));
        }
    }

    


}