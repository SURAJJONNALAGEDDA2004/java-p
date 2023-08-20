import java.util.Scanner;
public class m1_10pattern {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int a = sc.nextInt();
            int i;
            int j;
            for(i=1;i<=a;i++){
                for(j=1;j<=i;j++){
                    System.out.print(j);
                }   
                System.out.print("\n");  
            }
            sc.close();
    }
}
