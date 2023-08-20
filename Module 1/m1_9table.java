import java.util.Scanner;
public class m1_9table {
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the table you need");
            int a = s.nextInt();
            System.out.println("Enter the number of terms");
            int b = s.nextInt();
            int i;
            System.out.println("The" +a+"th table is :");
            for(i=0;i<=b;i++){
                System.out.println(a+"X" +i+ "="+a*i);
            }
            s.close();
        }
    }
}