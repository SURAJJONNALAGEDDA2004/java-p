// Create a class Triangle from Polygon in package pack2
package pack2;



import pack1.Polygon;



public class Triangle implements Polygon {

    private double sideA;

    private double sideB;

    private double sideC;



    public Triangle(double sideA, double sideB, double sideC) {

        this.sideA = sideA;

        this.sideB = sideB;

        this.sideC = sideC;

    }



    // Override method to calculate area of the triangle

    public double area() {

        if (isEquilateral()) {

            throw new IllegalArgumentException("Equilateral triangle not supported.");

        }

        double s = (sideA + sideB + sideC) / 2;

        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

    }



    // Raise an exception if it is an equilateral triangle

    private boolean isEquilateral() {

        return sideA == sideB && sideB == sideC;

    }

}