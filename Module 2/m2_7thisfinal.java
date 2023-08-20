class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  
    class Final {
        final int AGE = 32;
          void display(){
              System.out.println("Age: " + AGE);
        }
        }
    class m2_7thisfinal{  
    public static void main(String args[]){  
    Student s1=new Student(111,"ankit",5000);  
    Student s2=new Student(112,"sumit",6000);  
    Final s3=new Final();
    s1.display();  
    s2.display();  
    s3.display();
    String str1 = new String("CS");
    System.out.println(str1);
       str1 = null;
      
       System.gc();
       System.out.println("output of main method");
    }
} 
class finalizeMethod {
   
   protected void finalize()
   {
       System.out.println("output of finalize method");
   }
}

      