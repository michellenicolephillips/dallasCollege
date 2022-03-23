public class Rectangle extends Shape {
     private int width;
     private int height;

     public Rectangle() {
     }   
     public Rectangle(int height) {
          this.height = height;
          this.width = height * 2;
     }  
     public int getWidth() {
          return width;
     }
     public int getHeight(){
          return height;
     }
     public int calculateArea(int width, int height) {
          return width * height;
     }
     public void drawing(int width, int height){
          for (int i = 0; i < width; i++) {
               for (int j = 0; j < height; j++) {
                    if (i == 0 || i == width - 1) {
                         System.out.print(" *");
                    } else {
                         if (j == 0 || j == height - 1) {
                              System.out.print(" *");
                         } else {
                              System.out.print("  ");
                         }
                    }
               }
               System.out.println();
          }
     }
}
