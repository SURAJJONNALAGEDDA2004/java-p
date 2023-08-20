
class stringb{  
    public static void main(String args[]){  
    StringBuffer s=new StringBuffer("Good ");  
    s.append("Morning ");
    System.out.println(s);
    s.insert(13,"Suraj");//now original string is changed  
    System.out.println(s);
    s.reverse();
    System.out.println(s);
    s.reverse();
    System.out.println(s);
    s.delete(0,6);  
    System.out.println(s);
    s.replace(1,4,"Eve");  
    System.out.println(s);

    char letters[ ] = { 's', 'u', 'r', 'a', 'j' }; 
    String s1 = new String(letters); 
    System.out.println(s1); 

    char lett[ ] = { 's', 'u', 'r', 'a', 'j', 'a', 'b'  };
    String s2 = new String(lett,0, 5);
    System.out.println(s2);

    byte VALUES[] = { 97, 98, 99, 100 };  
    String s3 = new String(VALUES); 
    System.out.println(s3); 
    }  
    }  
