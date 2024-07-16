class Circle {

      public double x, y; // centre of the circle
      public double r;    // radius of circle

      //Methods to return circumference and area
      public double circumference() { 
		return 2*3.14*r;
      }
      public double area() { 
		return 3.14 * r * r; 
     }
}
class MyMain{
    public static void main(String args[]){
        Circle aCircle;  // creating reference
        aCircle = new Circle(); // creating object
        aCircle.x = 10;  // assigning value to data field
        aCircle.y = 20;
        aCircle.y = 5;
        double area = aCircle.area(); // invoking method
        double circumf = aCircle.circumference();
        System.out.println("Radius="+aCircle.r+" Area="+area);
        System.out.println("Radius="+aCircle.r+" Circumfrence ="+circumf);
    }

}

