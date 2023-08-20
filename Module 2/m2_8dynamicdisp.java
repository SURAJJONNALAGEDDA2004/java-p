class Human {
    public void move() {
       System.out.println("Humans can move");
    }
 }
 
 class Adults extends Human {
    public void move() {
       System.out.println("Adults can walk and run");
    }
 }
 
 public class m2_8dynamicdisp {
 
    public static void main(String args[]) {
    
       Human a = new Human();
       Human b = new Adults();
       a.move(); 
       b.move();
    }
 }