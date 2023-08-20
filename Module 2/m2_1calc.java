import java.util.Scanner;
public class m2_1calc {
    public static void main(String args[]){
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();
        System.out.println("Enter the operation u want");
        char num3= sc.next().charAt(0);

        switch(num3){
            case '+':
            Calculator cal=new Calculator();
                result=cal.Add(num1,num2);
                System.out.println(result);
                break;
            case '-':
            Calculator calc=new Calculator();
                result=calc.sub(num1,num2);
                System.out.println(result);
                break;
            case '*':
            Calculator b=new Calculator();
                result=b.mul(num1,num2);
                System.out.println(result);
                break;
            case '/':
            Calculator ca=new Calculator();
                result=ca.div(num1,num2);
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid symbol");
                
                break;
        }
    
        sc.close();
    }  
}
class Calculator
{
  public int Add(int num1, int num2)
  {
    System.out.println("The addition result is : ");
    return num1 + num2;
  }

  public int sub(int num1, int num2)
  {
    System.out.println("The Subtraction result is : ");
    return num1 - num2;
  }

  public int mul(int num1, int num2)
  {
    System.out.println("The multiplication result is : ");
    return num1 * num2;
  }

  public int div(int num1, int num2)
  {
    System.out.println("The Division result is : ");
    return num1 / num2;
  }
}
