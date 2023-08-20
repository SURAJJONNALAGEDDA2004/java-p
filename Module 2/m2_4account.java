import java.util.Scanner;

public class m2_4account {
    public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);

System.out.print("Enter initial balance: ");
double initialBalance = scanner.nextDouble();
m2_4account myaccount = new m2_4account(initialBalance);

System.out.print("Enter amount to deposit: ");
double depositAmount = scanner.nextDouble();
myaccount.deposit(depositAmount);

System.out.print("Enter amount to withdraw: ");
double withdrawAmount = scanner.nextDouble();
myaccount.withdraw(withdrawAmount);

System.out.println("Current balance: " + myaccount.getBalance());

scanner.close();
}
    private double balance;
   
    public m2_4account(double initialBalance)
    {
        balance = initialBalance;
    }
   
    public void deposit(double amount)
    {
        balance += amount;
    }
   
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
        }
        else

        {
        System.out.println("Insufficient funds.");
}
}

public double getBalance()
{
return balance;
}
}

