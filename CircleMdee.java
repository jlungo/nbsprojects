public class CircleMdee{
    public double x,y; // cenre of the circle
    public double r;   // radius of the circle

    // Method Circumference of the Circle
    public double circumference(){
        return 2*3.14*r;
    }

    // Method Area of the Circle
    public double area(){
        return 2*3.14*r;
    }
}

class MyMain{
    public static void main(String[] args){
        CircleMdee aCircle;
        aCircle = new CircleMdee();
        aCircle.x = 10;
        aCircle.y = 20;
        aCircle.r = 5;
        double area = aCircle.area();
        double circumf = aCircle.circumference();
        System.out.println("Radius = " + aCircle.r + " Area = " + area);
        System.out.println("Radius = " + aCircle.r + " Circumference = " + circumf);
    }
}