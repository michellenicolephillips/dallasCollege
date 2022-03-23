public class Triangle extends Shape {
     private int base;
     private int height;
     public Triangle() {
     }
     public Triangle(int base) {
          this.base = base;
          this.height = base + 3;
     }
     public int getBase(){
          return base;
     }
     public int getHeight(){
          return height;
     }
     public int calculateArea(int base, int height) {
          return (base * height) / 2;
     }
     public void drawing(int base) {
          for (int i = 0; i < base; i++) {
               for (int j = 0; j <= i; j++) {
                    if (i == 0 || i == base -1) {
                         System.out.print( " *");
                    } else { 
                         if (j == 0 || j == i) {
                              System.out.print(" *");
                         }
                         else {
                              System.out.print("  ");
                         }
                    }
               }
                    System.out.println();
          }
     }
}
