public class Circle implements Shape {
     private int radius;

     public Circle() {
     }   

     public Circle(int radius) {
          this.radius = radius;
     }  

     public int getRadius() {
          return radius;
     }

     public double calculateArea(int radius) {
          return Math.PI * radius * radius;
     }
@Override public void drawing (int radius) {
     System.out.println("This is a circle of radius " + radius);
}
}
