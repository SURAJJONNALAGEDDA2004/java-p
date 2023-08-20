// Accessing protected members in the same class

class Main {

    protected int year = 2021;

    protected void printYear() {

        System.out.println("Its " + year + " !!");

    }

    public static void main(String[] args) {

        Sample sample = new Sample();

        System.out.println(sample.year);

        sample.printYear();

    }

}

// Output: 2021 Its 2021 !!



// Accessing protected members in other classes of the same package

class Sample {

    protected int year = 2021;

    protected void printYear() {

        System.out.println("Its " + year + " !!");

    }

}

public class Test {

    public static void main(String[] args) {

        Sample sample = new Sample();

        System.out.println(sample.year);

        sample.printYear();

    }

}

// Output: 2021 Its 2021 !!



// Accessing protected members of a class in its subclass in the same package

class Sample {

    static protected String title = "geekforgeeks";

    protected int year = 2021;

    protected void printYear() {

        System.out.println("Its " + year + " !!");

    }

}

public class Test extends Sample {

    public static void main(String[] args) {

        Sample sample = new Sample();

        System.out.println(sample.year);

        sample.printYear();

        System.out.println(Sample.title);

    }

}

// Output: 2021 Its 2021 !! geekforgeeks



// Accessing protected members in another class in a different package

// We cannot access the protected members of a class in a class (non-subclass) that is present in a different package.



// Example 1: Package 1

package package1;

public class Sample {

    static protected String title = "geeksforgeeks";

    protected int year = 2021;

    protected void printYear() {

        System.out.println("Its " + year + " !!");

    }

}



// Example 2: Package 2

package package2;

import package1.Sample;

public class Test {

    public static void main(String[] args) {

        Sample sample = new Sample();

        System.out.println(sample.year);

        sample.printYear();

        System.out.println(Sample.title);

    }

}



// Accessing protected members in sub-class in a different package.

// We can access protected members of a class in its subclass present in a different package.
