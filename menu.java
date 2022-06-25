
package task_ATM;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class menu extends detail {
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
    public void GetLogin() throws IOException
    {
        int x=1;
        do
        {
            try
            {
                data.put(567,4444);
                data.put(190,6376);
                System.out.println("welcome to the ATM Project");
                System.out.println("Enter your Cutomer account number");
                Setcustomernumber(sc.nextInt());
                System.out.println("Enter pinnumber");
                Setpinnumber(sc.nextInt());
            }
            catch(Exception e)
            {
                System.out.println("Invalid character please enter only numbers ");
            }
             int cn=Getcutomernumber();
             int pn=Getpinnumber();
             if(data.containsKey(cn)&& data.get(cn)==pn)
             {
                 Getaccounttype();
             }
             else
             {
                 System.out.println("\n"+"wrong number or wrong pin number"+"\n");
             }
                        
                    
        }while(x==1);
    }
    public void Getaccounttype()
    {
        System.out.println("select the account type");
        System.out.println("1. Checking account");
        System.out.println("2. Saving account");
        System.out.println("3. exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:Getcheaking();
                   break;
            case 2:Getsaving();
                   break;
            case 3:System.out.println("Thank you for using this atm");
                   break;
            default:System.out.println("Invalid choice. Please enter valid choice");
                    Getaccounttype();
        }
    }
    public void Getcheaking()
    {
        System.out.println("You selected cheaking account ");
        System.out.println("1. Transaction History");
        System.out.println("2. withdraw");
        System.out.println("3. deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: GetcheckingTranHistory();
                    Getcheaking();
                    break;
            case 2: Getcheakingwithdraw();
                    Getcheaking();
                    break;
            case 3: Getcheakingdeposite();
                    Getcheaking();
                    break;
            case 4: GetcheckingTransfer();
                    Getcheaking();
                    break;
            
            case 5: System.out.println("Thank you for visiting this atm ");
                    break;
            default: System.out.println("Invalid choice please enter valid choise");
                     Getcheaking();
                     break;                   
        }
    }
    public void Getsaving()
    {
        System.out.println("You selected saving account ");
        System.out.println("1. Transfer History");
        System.out.println("2. withdraw");
        System.out.println("3. deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: GetsavingTranHistory();
                    Getsaving();
                    break;
            case 2: Getsavingwithdraw();
                    Getsaving();
                    break;
            case 3: Getsavingdeposite();
                    Getsaving();
                    break;
            case 4: GetsavingTransfer();
                    Getsaving();
                    break;
            case 5: System.out.println("Thank you for visiting this atm ");
                    break;
            default: System.out.println("Invalid choice please enter valid choise");
                     Getsaving();
                     break;                   
        }
    }
    
}
