package masum;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    Scanner input =new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###.##0.00");
    private int customerNumber;


    //to set cumstomer number
    public int setcumtomerNumner(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;

    }
    //to get customer number
    public int getCustomerNumber(){
        return customerNumber;
    }
    //to set the pin number
    public int setPinNumber(int pinNumber);

    {
        this.pinNumber = pinNumber;
        return pinNumber;

    }


}