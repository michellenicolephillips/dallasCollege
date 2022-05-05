public class Rectangle implements Shape {
     private int width;
     private int length;

     public Rectangle() {
     }   
     public Rectangle(int n) {
          this.width = n;
          this.length = n * 2;
     }  
     public int getWidth() {
          return width;
     }
     public int getLength(){
          return length;
     }
     public int calculateArea(int width, int length) {
          return width * length;
     }
     @Override public void drawing(int n){
       System.out.println("This is a rectangle of length " + length + " X width " + width);
     }
}
