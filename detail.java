
package task_ATM;

import java.util.Scanner;


public class detail {
     private int customernumber;
    private int pinnumber;
    private double cheakingbalance=0;
    private double savingbalance=0;
    public String transactionHistory = "";
    Scanner s=new Scanner(System.in);
    public int Setcustomernumber(int customernumber)
    {
        this.customernumber= customernumber;
        return customernumber;
    }
     public int Setpinnumber(int pinnumber)   
    {
        this.pinnumber= pinnumber;
        return pinnumber;
    }
     public int Getcutomernumber()
     {
         return customernumber;
     }
     public int Getpinnumber()
     {
         return pinnumber;
     }
     public double Getcheakingbalance()
     {
         return cheakingbalance;
     }
     public double Getsavingbalance()
     {
         return savingbalance;
     }
     public double calcheckwithdraw(double amount)
     {
         cheakingbalance=(cheakingbalance-amount);
         return cheakingbalance;
     }
      public double calsavewithdraw(double amount)
     {
         savingbalance=(savingbalance-amount);
         return savingbalance;
     }
      public double calcheakdeposite(double amount)
      {
          cheakingbalance=(cheakingbalance+amount);
          return cheakingbalance;
      }
      public double calsavedeposite(double amount)
      {
          savingbalance=(savingbalance+amount);
          return savingbalance;
      }
      public void GetcheckingTranHistory()
      {
          System.out.println(transactionHistory); 
      }
      public void GetsavingTranHistory()
      {
          System.out.println(transactionHistory); 
      }
     public void Getcheakingwithdraw()
     {
         System.out.println("Your cheaking account balance is "+cheakingbalance);
         System.out.println("Enter the amount you want to withdraw:");
         double amount=s.nextDouble();
         if((cheakingbalance-amount)>=0)
         {
             calcheckwithdraw(amount);
             System.out.println("new cheaking account balance is "+cheakingbalance);
             String s1="\nwithdraw of rupees:"+amount;
             transactionHistory = transactionHistory.concat(s1);
         }
         else
         {
             System.out.println("balance cannot be negative");
         }
     }
      public void Getsavingwithdraw()
     {
         System.out.println("Your cheaking account balance is "+savingbalance);
         System.out.println("Enter the amount you want to withdraw:");
         double amount=s.nextDouble();
         if((savingbalance-amount)>=0)
         {
             calsavewithdraw(amount);
             System.out.println("new cheaking account balance is "+savingbalance);
             String s1="\nwithdraw of rupees:"+amount;
             transactionHistory = transactionHistory.concat(s1);
         }
         else
         {
             System.out.println("balance cannot be negative");
         }
     } 
      public void GetcheckingTransfer()
       {
           System.out.println("Enter Receipent's name : ");
           String rec= s.next();
           
           System.out.println("Enter Amount to transfer  : ");
           double amount=s.nextDouble();
           if((cheakingbalance-amount)>=0)
         {
             if(amount<=5000)
             {
             calcheckwithdraw(amount);
             System.out.println("amount is transfered to "+rec);
             System.out.println("new cheaking account balance is "+cheakingbalance);
             String src ="\n"+amount+" transferred to "+rec;
             transactionHistory = transactionHistory.concat(src);
             }   
             else 
             {
                 System.out.println("sorry limit to transfer amount is 50000 ");
             }
         }
         else
         {
             System.out.println("balance cannot be negative");
         }    
       }
     
       public void GetsavingTransfer()
       {
           System.out.println("Enter Receipent's name : ");
           String rec= s.next();
           
           System.out.println("Enter Amount to transfer  : ");
           double amount=s.nextDouble();
           if((savingbalance-amount)>=0)
         {
             if(amount<=5000)
             {
             calsavewithdraw(amount);
             System.out.println("amount is transferred to "+rec);
             System.out.println("new saving account balance is "+savingbalance);
             String src ="\n"+amount+" transferred to "+rec;
             transactionHistory = transactionHistory.concat(src);
             }   
             else 
             {
                 System.out.println("sorry limit to transfer amount is 50000 ");
             }
         }
         else
         {
             System.out.println("balance cannot be negative");
         }    
       }
     public void Getcheakingdeposite()
     {
         System.out.println("your cheaking account balance:"+cheakingbalance);
         System.out.println("ammount you want to deposit to your cheaking account:");
         double amount=s.nextDouble();
         if((cheakingbalance+amount)>=0)
         {
             calcheakdeposite(amount);
             System.out.println("new cheaking account balance:"+cheakingbalance);
             String s2="\n deposit of rupees:"+amount;
             transactionHistory = transactionHistory.concat(s2);
         }
         else
         {
             System.out.println("balance cannot be negative");
         }
     }
     public void Getsavingdeposite()
     {
        System.out.println("your cheaking account balance:"+savingbalance);
         System.out.println("ammount you want to deposit to your saving account:");
         double amount=s.nextDouble();
         if((savingbalance+amount)>=0)
         {
             calsavedeposite(amount);
             System.out.println("new saving account balance:"+savingbalance);
             String s2="\n deposit of rupees:"+amount;
             transactionHistory = transactionHistory.concat(s2);
         }
         else
         {
             System.out.println("balance cannot be negative");
         } 
     }
             

    
}
