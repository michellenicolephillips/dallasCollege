import java.util.Scanner;

public class PrintShape {
   
     public static void main (String[] args) {
          int n = 0;
          while (n > 20 || n < 2 || n % 2 != 0) {
               System.out.println("Enter wholeeven number more than 2 and less than 20:");     
               Scanner userNumberInput = new Scanner(System.in);
               n = userNumberInput.nextInt();
               if (n == -1) {
                    break;
               }
          }
          switch(n){
               case 6:
               case 14:
               case 16:
                    Shape circle = new Circle(n);
                    ((Circle)circle).calculateArea(n);
                    circle.drawing(n);
                    break;
               case 4:
               case 10:
               case 18:
                    Shape rect = new Rectangle(n);
                    ((Rectangle)rect).calculateArea(n, n*2);
                    rect.drawing(n);
                    break;
               default:
                  System.out.println("Number is not valid");
                    break;
          }
     }
}