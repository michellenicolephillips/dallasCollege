import java.util.Scanner;

public class DrawShapes {

     public static void drawSquare(int n) {
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    System.out.print(" *");
               }
               System.out.println();
          }
     }

     public static void drawBox(int n) {
          int i = 0;
          while (i < n) {
               int j = 0;
               while (j < n) {
                    if (i == 0 || i == n-1) {
                         System.out.print(" *");
                    } else {
                         if (j == 0 || j == n - 1) {
                              System.out.print(" *");
                         } else {
                              System.out.print("  ");
                         }
                    }
                    j++;
               }
               System.out.println();
               i++;
          }
     }

     public static void main (String[] args) {
          int n = 0;
          while (n > 20 || n < 0 || n % 2 == 0) {
               System.out.println("Enter whole odd number less than 20:");     
               Scanner userNumberInput = new Scanner(System.in);
               n = userNumberInput.nextInt();
               if (n == -1) {
                    break;
               }
          }
          switch (n) {
               case 5:
               case 11:
               case 15:
                    drawSquare(n);
                    break;
               case 3:
               case 9:
               case 17:
                    drawBox(n);
                    break;
               default:
                    System.out.println("To be determined.");
                    break;
          }

     }
}