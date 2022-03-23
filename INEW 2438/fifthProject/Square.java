class Square extends Shape {
     private int side;
     public Square() {
     }
     public Square(int side){
          this.side = side;
     }
     public int getSide(){
          return side;
     }
     public int calculateArea(int side) {
          return side * side;
     }
     public void drawing(int side) {
          for (int i = 0; i < side; i++) {
               for (int j = 0; j < side; j++) {
                    if (i == 0 || i == side - 1) {
                         System.out.print(" *");
                    } else {
                         if (j == 0 || j == side - 1) {
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
