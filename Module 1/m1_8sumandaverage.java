import java.util.Scanner;

public class m1_8sumandaverage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        System.out.println("Enter the fourth number");
        int d = sc.nextInt();
        System.out.println("Enter the fifth number");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        int avg = sum/5;
        System.out.println(sum+ " is the sum of the five numbers");
        System.out.println(avg+" is the average of five numbers");
        sc.close();
    }
}
