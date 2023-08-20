
public class m2_6statnonstat {
    
    static int num = 007;
    static String str = "James Bond";
  
    // This is Static method which allocates memory only at run time
    static void display()
    {
        System.out.println("static number is " + num);
        System.out.println("static string is " + str);
    }
    // non-static method
    void nonstatic()
    {
        // our static method can accessed in non static method
        display();
    }
    public static void main(String args[])
    {
        m2_6statnonstat obj = new m2_6statnonstat();
        
        // This is object to call non static function
        obj.nonstatic();
        
        // static method can called directly without an object
        display();
    }
}
