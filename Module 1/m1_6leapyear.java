import java.util.Scanner;
public class m1_6leapyear {
    public static void main(String args[]){
        System.out.println("Enter the year");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a%4==0){
                if(a%100==0){
                    if(a%400==0){
                        System.out.println(a+ " it is a leap year");
                }
                else{
                    System.out.println(a+ " is not a leap year");
                }
              }
            else{
                System.out.println(a+ " is a leap year");
            }
        }
        else{
            System.out.println(a+ " is not a leap year");
         }
        sc.close();
}
}