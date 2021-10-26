package masum;
/*main class*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account{

    Scanner menuInput= new Scanner(System.in);

    DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");

    HashMap<Integer ,Integer> data = new HashMap<>();

    /*validate login information customer number and Pin Number */

    public void  getLogin()  {
        int x = 1;

        do {
            try
                {
                    /*
                    * Account Keys */

                    data.put(2012020116,116);
                    data.put(2012020107,107);
                    data.put(2012020133,133);
                    data.put(2012020131,131);
                    System.out.println("Welcome to ATM Project|");

                    System.out.println("Enter your Customer number : ");
                    setCustomerNumber(menuInput.nextInt());
                    System.out.println("Enter Your Pin number: ");
                    setPinNumber(menuInput.nextInt());
                    
                }catch (IllegalArgumentException e){

                    System.out.println("\n" + "Invalid character(s). Only numbers.\n");
                    x = 2;}


                    for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                        if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber())
                        {
                        getAccountType();
                    }
                }
                System.out.println("\n" + "Wrong Customer Number or Pin Number " + "\n");

            } while (x == 1) ;
        }
        /*display account type menu with selection*/

        public void getAccountType(){
        System.out.println("Select the Account you want ot access:");
        System.out.println("Type 1-Checking Account");
        System.out.println("Type 2-Saving Account");
        System.out.println("Type 3- Exit ");
        selection = menuInput.nextInt();

            switch (selection) {
                case 1 -> getChecking();
                case 2 -> getSaving();
                case 3 -> System.out.println("ThankYou for using this ATM, Bye.");
                default -> {
                    System.out.println("\n" + "Invalid Choice." + "\n");
                    getAccountType();
                }
            }
        }


    //private void getAccountType()// new line added ...add comment line just in case show any error

    /*display Checking account menu with selections*/

    public void getChecking(){
        System.out.println("Checking Account");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2- Withdraw Funds");
        System.out.println("Type 3- Deposit Funds");
        System.out.println("Type 4- Exit");
        System.out.println("Choice: ");
        selection =menuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Checking Account Balance : "+moneyFormat.format(getCheckingBalance())+"\n");
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thanking for using ATM. Bye");
            default:
                System.out.println("\n"+"Invalid Choice "+"\n");
                getChecking();
        }

        }
        /*Display saving Account menu with selections*/

    public void getSaving(){
        System.out.println("Saving Account :");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2- Withdraw Funds");
        System.out.println("Type 3- Deposit Funds");
        System.out.println("Type 4- Exit");
        System.out.println("Choice: ");
        selection =menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Saving Account Balance :"+moneyFormat.format(getSavingBalance())+"\n");
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM.");
                break;
            default:
                System.out.println("""

                        Invalid Choice.
                        """);
                getSaving();
            }
        }
        int selection;
}