import java.util.Scanner;
public class m2_2
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name : ");
        String name=sc.next();
        System.out.print(" Encrypted and Decrypted versions are : ");
        for(int i = 0; i<name.length(); i++)
        {
            char a = name.charAt(i);
            int b= a+1;
            char c=(char)b;
            System.out.print(c);
        }
        System.out.print(" and ");
        for(int j = 0; j<name.length(); j++)
        {
            char a = name.charAt(j);
            int d= a-1;
            char e=(char)d;
            System.out.print(e);
        }
        sc.close();
    }
}