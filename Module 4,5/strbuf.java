public class strbuf {
    public static void main(String[] args){
        StringBuffer s = new StringBuffer("I am ");

        //Appending new words to the string
        s.append("Suraj");
        System.out.println("The appended String is: "+s);

        //Inserting at a given position
        s.insert(5,"Jonnalagedda ");
        System.out.println("The String after inserting ne word is: "+s);

        //replacing the given String from the specified beginIndex and endIndex
        s.replace(0, 4,"My name is"); 
        System.out.println("New string after replacing is: "+s);
        
        //delete the String from the specified beginIndex to endIndex
        s.delete(12,23);  
        System.out.println("New String after delete is: "+s);

        //demonstrating capacity()
        System.out.println(s.capacity()); 
        s.append(".I am learning java");
        System.out.println(s.capacity());
        s.append(" Language");
        System.out.println(s.capacity());

        //reversing a given string
        StringBuffer sb = new StringBuffer("Java programming");
        sb.reverse();
        System.out.println("Reversed String is: "+sb);

        //Length of the string
        System.out.println("length of s is:"+s.length());

        // Demonstrate the substring() method
        StringBuffer sbs = new StringBuffer(" in third semester");
	    System.out.println("string1 is: " + s);
        System.out.println("string2 is: " + sbs);
	    StringBuffer sbss = s.append(sbs);
	    System.out.println("Appending of two strings is: "+ sbss);

        //Printing the character at a given index
        char a= sb.charAt(6);
        System.out.println("The character at the given Index is: "+a);

        // Demonstrate the indexOf() method
        int b = s.indexOf("Suraj");
        System.out.println("Index of /Suraj/ is: "+b);

        //Using lastindexof() to find the last occurence of the string
        StringBuffer x = new StringBuffer("Java is powerful language and old language");
        int i = x.lastIndexOf("language");
        System.out.println("last occurence of the string language is: "+i);

        // Appending the CodePoint as String to the string using appendCodePoint()
        StringBuffer y = new StringBuffer("Jav");
        y.appendCodePoint(97);
        System.out.println("After appending CodePoint is: "+y);

    }
}
