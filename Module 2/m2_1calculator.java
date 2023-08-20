import java.util.Scanner;
public class m2_1calculator{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int num1= sc.nextInt();
            System.out.println("Enter the second number");
            int num2= sc.nextInt();
    
                    Add(num1,num2);
                    sub(num1,num2);
                    mul(num1,num2);
                    div(num1,num2);
                    modu(num1,num2);

            sc.close();      
    }

public static void Add(int num1, int num2){ 
  System.out.println("The addition result is : ");
  System.out.println(num1+num2); 
}

public static void sub(int num1, int num2){
  System.out.println("The Subtraction result is : ");
  System.out.println(num1-num2); 
}

public static void mul(int num1, int num2){
  System.out.println("The multiplication result is : ");
  System.out.println(num1*num2); 
}

public static void div(int num1, int num2){
  System.out.println("The Division result is : ");   
  System.out.println(num1/num2); 
}

public static void modu(int num1, int num2){
  System.out.println("The Reaminder result is : ");   
  System.out.println(num1%num2); 
}
}