import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;

class A{
    final String bank_name="IDFC Bank";

    private  long acc_no;
      int balance;
     Scanner ob=new Scanner(System.in);
    void CreateAcc()
    {
        try{
        balance=(int)Math.random()*(1000-500+1)+1000;
      
        System.out.println("Enter account number");
        acc_no=ob.nextInt();
    
        
        }
        catch(InputMismatchException exception)
        {
            exception.printStackTrace();
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }
    }
    boolean getacc(long acc_no)
    {
        if(this.acc_no==acc_no)
        {
            return true;
        }
        return false;
    }



int  showBalance()
{
    
return balance;
}
    
   void Transfer()
   {
    System.out.println("Enter amount to transfer");
    try{
    int amt=ob.nextInt();
    if(balance<amt)
    {
        System.out.println("Current balance is not sufficient for this transfer ");
    }
    else
      balance=balance-amt;
      System.out.println("Amount Transfered");
   }
   catch(InputMismatchException e)
   {
          e.printStackTrace();}
   }
   void deposit()
   {
    System.out.println("Enter amount to deposit");
    try{
    int amt=ob.nextInt();

    balance=balance+amt;
   }
   catch(Exception e){
    System.out.println("Enter corect input type"+e);

   }
}
   void withraw()
   {
    System.out.println("Enter amount to withraw");
    try{
    int amt=ob.nextInt();
    if(balance<amt)
    {
        System.out.println("Current balance is not sufficient for this withrawal ");
    }
    else{
    balance=balance-amt;
    System.out.println("Withrawal sucessfull");
    }}
    catch(Exception e)
    {
        System.out.println("Enter correct input type");
    }
   
   }}

    



public class Bank {
public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter number of users you want to add");
    int n=ob.nextInt();
A v[]=new A[n];
for(int i=0;i<v.length;i++)
{
     v[i]=new A();
     System.out.println("User:"+i+1);
     v[i].CreateAcc();
     System.out.println();
     
}
System.out.println("Operations ");
System.out.println("1: Deposit");
System.out.println("2: Withrawal");
System.out.println("3: Transfer");
System.out.println("4: Show Balance");
System.out.println("5: Exit");
System.out.println("Enter your choice");
int ch=ob.nextInt();
do{
switch(ch)
{
    case 1:
    int acc_no=ob.nextInt();
    int i;
    for( i=0;i<n;i++)
    {
    if(v[i].getacc(acc_no));
    {
     v[i].deposit();
     break;}
}
if(i==n){
    System.out.println("Enter valid account number");
}
case 2:
int k;
int acn=ob.nextInt();
for( k=0;k<n;k++)
{
if(v[k].getacc(acn));
{
 v[k].withraw();
 break;}
}
if(k==n){
System.out.println("Enter valid account number");
}

case 3:
int l;
int ac=ob.nextInt();
for( l=0;l<n;l++)
{
if(v[l].getacc(ac));
{
 v[l].Transfer();
 break;}
}
if(l==n){
System.out.println("Enter valid account number");
}



case 4:
int u;
for( u=0;u<n;u++)
{
int j=v[u].showBalance();
 System.out.println("User"+(u+1)+"balance is:"+j);
}
break;
default:
System.out.println("Invalid oprtion");
}
}
while(ch!=5);
}
   
}
    

