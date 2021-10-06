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
        int x=1;
        do{
            try {
                {
                    data.put();
                    data.put();
                    System.out.println("Welcome to ATM Project|");
                    System.out.println("Enter your Customer number : ");
                    setcumtomerNumner(menuInput.nextInt());
                }
                catch(Exception e){
                    System.out.println("/n" + "Invalid character(s). Only numbers."+"/n");
                    x=2;
                    for (Entry<Integer ,Integer> entry : data.entrySet()) {
                        if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNum)
                            getAccountType();
                    }
                    }
                System.out.println();

                }



            }
        }
    }



}
