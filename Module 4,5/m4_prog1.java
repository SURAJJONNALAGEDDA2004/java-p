class point{
    double x;
    double y;
    double distance(point p1, point p2){
        double result = Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
        System.out.println("The Distance between points p1 and p2 : "+result);
        return result;

    }
}
class Circle extends point{
    public static void main(String args[]){
        point a = new point();
    a.x=0;
    a.y=0;
    point b = new point();
    b.x=0;
    b.y=0;
    Circle C = new Circle();
    C.distance(a,b);

    }
}