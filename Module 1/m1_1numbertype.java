import java.util.Scanner;
public class m1_1numbertype {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in) ;
        System.out.println("Enter the number : ");
        int num = a.nextInt();
        if(num>0) {
            System.out.println("The number is Positive");
        }
        else  {
            System.out.println("The number is Negative ");
        }
        a.close();
    }
}
