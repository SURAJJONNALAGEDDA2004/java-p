import java.util.Scanner;
public class m2_5book
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter book code: ");
            int code = sc.nextInt();

           
            System.out.print("Enter book title: ");
            String title = sc.next();
           
            System.out.print("Enter book price: $");
            double price = sc.nextDouble();
           
            m2_5book myBook = new m2_5book(code, title, price);
           
            System.out.println("Book code: " + myBook.getCode());
            System.out.println("Book title: " + myBook.getTitle());
            System.out.println("Book price: " + myBook.getPrice());
       
        sc.close();
    }
    private int code;
    private String title;
    private double price;
   
    public m2_5book(int code, String title, double price)
    {
        this.code = code;
        this.title = title;
        this.price = price;
    }
   
    public int getCode()
    {
        return code;
    }
   
    public String getTitle()
    {
        return title;
    }
   
    public double getPrice()
    {
        return price;
    }
}

