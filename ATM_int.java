import java.util.Scanner;

class ATM_int
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int ID=1234,EID;
        int pin=1221,epin;
        int amount=0;
        int choice,i=0;
        int count=0;
        String []transaction=new String[100];
        do
        {
            System.out.print("Enter ID : ");
			EID = sc.nextInt();
			System.out.print("Enter PIN : ");
			epin = sc.nextInt();
			if(ID != EID|| pin!=epin)
			{
                System.out.println("PLEASE ENTER VALID CREDENTIALS");
            }
        }while(ID != EID|| pin!=epin);
        while(true)
        {
            System.out.println("\n\n****************ATM Services****************");
            System.out.println("1.Transactions");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Transfer");
            System.out.println("5.Check Balance");
            System.out.println("6.Logout");
            System.out.print("Enter Your Choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                        System.out.println("*****************TRANSACTIONS*****************");
                        for(int j=0;j<i;j++)
                        {
                            System.out.println(transaction[j]);
                        }
                        break;
                case 2:
                        System.out.println("*****************WITHDRAW*****************");
                        System.out.println("Enter amount to withdraw : ");
                        int wamount=sc.nextInt();
                        if(wamount%100==0 && amount>wamount && amount-wamount>=500)
                        {
                            amount-=wamount;
                            System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY");
                            transaction[i]=new String(i+1 + ")Withdraw Rs:"+wamount);
                            i++;
                        }
                        else if(amount-wamount<500)
                        {
                            System.out.println("INSUFFICIENT BALANCE");
                        }
                        else if(wamount%100!=0)
                        {
                            System.out.println("ENTER AMOUNT MULTIPLE OF 100");
                        }
                        break;
                case 3:
                        System.out.println("*****************DEPOSIT*****************");
                        System.out.println("Enter amount to deposit : ");
                        int damount=sc.nextInt();
                        amount+=damount;
                        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
                        transaction[i]=new String(i+1+")Deposit Rs :"+damount);
                        i++;
                        break;
                case 4:
                        System.out.println("*****************TRANSFER*****************");
                        System.out.print("Enter Receiver name :");
                        String name=sc.next();
                        System.out.print("Enter Amount to transfer : ");
                        int tamount=sc.nextInt();
                        if(amount-500<tamount && tamount<100000)
                        {
                            System.out.println("INSUFFICIENT BALANCE");
                        }
                        else if(tamount>100000)
                        {
                            System.out.println("Sorry! limit is Rs.100000");
                        }
                        else
                        {
                            amount-=tamount;
                            System.out.println("Amount " + tamount+" transfered to "+ name + " successfully.");
                            transaction[i]=new String(i+1+")Transfer "+tamount);
                            i++;
                        }
                        break;
                case 5:
                        System.out.println("Remaining balance :"+amount);
                        break;
                case 6:
                        System.out.println("THANK YOU!!!");
                        System.exit(0);
                        break;
                default:
                        System.out.println("Enter valid choice..");
            }
        }
    }
}