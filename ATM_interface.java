import java.util.Scanner;

public class  ATM_interface 
{
    public static void main(String[] args)
     {
        int balance = 100000, withdraw, deposit ;
        Scanner sc = new Scanner(System.in);

        while(true)
    {
        
    System.out.println("ATM Menu:");
    System.out.println("1.Check Balance");
    System.out.println("2.Deposit");
    System.out.println("3.Withdraw");
    System.out.println("4.Exit");
    System.out.println("choose the operation you want to perform:");
    
    int choice = sc.nextInt();
    switch(choice) 
    {
        case 1:
             System.out.println("Balance :" + balance);
             System.out.println("");
             break;
        case 2:
            System.out.println("Enter the money to be deposited : ");
            deposit = sc.nextInt();

            balance = balance + deposit;
            System.out.println("your money has been successfully deposited");
            System.out.println("");
             break; 
        case 3:
            System.out.println("Enter  the money to be withdrawal : ");
            withdraw = sc.nextInt();
            if(balance >= withdraw)
            {
                balance = balance - withdraw;
                System.out.println("please collect your money.");
            }
            System.out.println("");
            break;
            
            
        case 4:
            System.out.println("Exiting ATM. Thank you!");
            
            System.exit(0);
             }
       }
    }
}

