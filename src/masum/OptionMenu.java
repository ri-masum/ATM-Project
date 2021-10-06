package masum;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
    Scanner menuInput= new Scanner(System.in);
    DecimalFormat moneyformat =new DecimalFormat("'$'###,##0.00");
    HashMap<Integer ,Integer> data =new HashMap<Integer, Integer>();
    /*validate login information customer number and pin number */
    public void  getLogin() throws IOException {
        int x = 1;
        do {
            try {
                {
                    data.put();
                    data.put();
                    System.out.println("Welcome to ATM Project|");
                    System.out.println("Enter your Customer number : ");
                    setcumtomerNumner(menuInput.nextInt());
                }
                catch(Exception e){
                    System.out.println("/n" + "Invalid character(s). Only numbers." + "/n");
                    x = 2;
                    for (Entry<Integer, Integer> entry : data.entrySet()) {
                        if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()
                            getAccountType();
                    }
                }
                System.out.println("/n" + "Wrong Customer Number or Pin Number " + "/n");

            } while (x == 1) ;
        }
        /*display account type menu with selection*/

        public void getAcoountType.nextInt();
        System.out.println("Secelet the Account you want ot access:");
        System.out.println("Type 1-Checking Account");
        System.out.println("Type 2-Saving Account");
        System.out.println("Type 3- Exit ");
        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChacking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("thankyou for using this ATM, Bye.");
                break;
            default:
                System.out.println("/n" + "Invalid Choice." + "/n");
                getAcoountType();
        }
    }
     /*display Chacking account menu with selections*/

    public void getChacking(){
        System.out.println("Chacking Account");
        System.out.println("Type 1- View Balance");
        System.out.println("Type 2- Withdraw Funds");
        System.out.println("Type 3- Deposite Funds");
        System.out.println("Type 4- Exit");
        System.out.println("Choice: ");
        selection =menuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Chacking Account Balance : "+moneyformat.format(getChacking();
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thanking for using ATM. Bye");
            default:
                System.out.println("/n"+"Invalid Choice "+"/n");
                getChacking();
        }

        }
        /*Display saving Account menu with selections*/

    public void getSaving(){
        System.out.println("Saving Account :");
        System.out.println("Type 1-View Balance");
        System.out.println("Type 1-View Balance");
        System.out.println("Type 2- Withdraw Funds");
        System.out.println("Type 3-Deposite Funds");
        System.out.println("Type 4- Exit");
        System.out.println("Choice: ");
        selection =menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Saving Account Balance :"+moneyformat.format(getSavingBalance());
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM.");
                break;
            default:
                System.out.println("/n"+"Invalid Choice."+"/n");
                getSaving();
            }
        }
        int selection;
}