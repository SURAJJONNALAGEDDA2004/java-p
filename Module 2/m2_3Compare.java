import java.util.Scanner;
public class m2_3Compare {
    public static void main(String args[]){
        System.out.print("Enter first integer: ");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        m2_3Compare x =new m2_3Compare();
        x.compare(num1, num2);
        
        System.out.print("Enter first character: ");
        char c1 = sc.next().charAt(0);
        System.out.print("Enter second character: ");
        char c2 = sc.next().charAt(0);
        sc.nextLine();
        compare(c1, c2);
        
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        compare(s1, s2);
        sc.close();
    }
     void compare(int num1 , int num2){
        if(num1>num2){
            System.out.println(num1+" is greater");
        }   
        else{
            System.out.println(num2+" is greater");
        }
    }
    public static void compare(char c1 , char c2){
        if(c1>c2){
            System.out.println(c1+" is greater");
        }   
        else{
            System.out.println(c2+" is greater");
        }  
    }
    public static void compare(String s1 , String s2){
        if(s1.length()>s2.length()){
            System.out.println(s1+" is greater");
        }   
        else{
            System.out.println(s2+" is greater");
        }   
    }
}
