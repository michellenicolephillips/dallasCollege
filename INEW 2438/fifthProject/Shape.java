import java.util.Scanner;

public class Shape {

     public Shape(){
     }
     public void drawing() {
          System.out.println("In shape instance");
     }

   
     public static void main (String[] args) {
          int n = 0;
          while (n > 20 || n < 2 || n % 2 == 0) {
               System.out.println("Enter whole odd number more than 2 and less than 20:");     
               Scanner userNumberInput = new Scanner(System.in);
               n = userNumberInput.nextInt();
               if (n == -1) {
                    break;
               }
          }
          switch(n){
               case 5:
               case 11:
               case 15:
                    Shape sq = new Square(n);
                    ((Square)sq).drawing(n);
                    ((Square)sq).calculateArea(n);
                    break;
               case 3:
               case 9:
               case 17:
                    Shape rect = new Rectangle(n);
                    ((Rectangle)rect).drawing(n, n*2);
                    ((Rectangle)rect).calculateArea(n, n*2);
                    break;
               default:
                    Shape tri = new Triangle(n);
                    ((Triangle)tri).drawing(n);
                    ((Triangle)tri).calculateArea(n, n+3);
                    break;
          }
     }
}