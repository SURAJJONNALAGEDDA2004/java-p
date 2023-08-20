import java.util.Scanner;
public class m1_5samedecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a= sc.nextFloat();
        System.out.println("Enter the second number");
        float b= sc.nextFloat();
        a=a*1000;
        b=b*1000;
        Float c=Math.abs(a-b);
        if(c<1){
            System.out.println("It is same upto three decimal places");
        }
        else{
            System.out.println("It is not same upto three decimal places");
        }

        sc.close();
    }
}
