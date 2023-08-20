import java.util.Scanner;
public class m1_2quadratic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a= sc.nextInt();
        System.out.println("Enter the value of b");
        double b= sc.nextInt();
        System.out.println("Enter the value of c");
        double c= sc.nextInt();
        double d=b*b -4*a*c;
        double x1= (-b+Math.pow(d,0.5))/(2*a);
        double x2= (-b-Math.pow(d,0.5))/(2*a);
        System.out.println(" The roots are : ");
        System.out.println(x1+"and"+x2);
        sc.close();
    }
}
