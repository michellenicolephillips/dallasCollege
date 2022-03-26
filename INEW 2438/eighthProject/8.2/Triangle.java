import java.util.Scanner;
import java.lang.Math;


public class Triangle {
     static double side1;
     static double side2;
     static double side3;
 /*
 Create a project to check if an user input can be the 3 sides of triangle.
1. To check if the 3 numbers are the sides of a triangle, the 3 side must follow the rules:
    side1 + side2 > side3, side3 + side2 > side1, and side1 + side3 > side2
2. To check if the 3 numbers are the sides of a right triangle,  the 3 side must follow the rules. If the triangle is a right triangle, claculate the angles.
   If the side2 is the longest, side2^2 = side1^2 + side3^2.
The methods you might use are:Math.sqrt(double a) , Math.asin(double a), Math.atan(double a). Math.toDegrees(a).
 */
static boolean checkIfTriangle() {
     return (side1 + side2 > side3 && side3 + side2 > side1 && side1 + side3 > side2);
}

static boolean checkIfRightTriangle() {
     return (side2 > side1 && side2 > side3 && Math.pow(side2, 2) == (Math.pow(side1, 2) + Math.pow(side3, 2)));
}
static void calculateAngles() {
     double angle1;
     angle1 = Math.asin(side1 / side2);
     angle1 = Math.toDegrees(angle1);
     double angle2;
     angle2 = Math.asin(side3 / side2);
     angle2 = Math.toDegrees(angle2);
     System.out.println("The angles of the right triangle are: " + angle1 + " and " + angle2);
}
     
     public static void main (String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number:");
          side1 = sc.nextDouble();
          System.out.println("Enter a second number:");
          side2 = sc.nextDouble();
          System.out.println("Enter a third number:");
          side3 = sc.nextDouble();
          System.out.println("You entered: " + side1 + ", " + side2 + ", " + side3);
          if (checkIfTriangle()) {
               System.out.println("Your sides make up a triangle");
          }
          if (checkIfRightTriangle()) {
               calculateAngles();
          }
     }
}
