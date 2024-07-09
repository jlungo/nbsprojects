import java.util.Scanner; //Import the Scanner class

public class TriangleMdee {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter Triangle base");
        int base = myObj.nextInt(); // Read user input

        System.out.println("Enter Triangle height");
        int height = myObj.nextInt(); // Read user input

        double area = 0.5 * base * height;

        System.out.println("TRIANGLE:");
        System.out.println("Base = " + base);
        System.out.println("Height = " + height);
        System.out.println("Area = " + area);
    }
}
