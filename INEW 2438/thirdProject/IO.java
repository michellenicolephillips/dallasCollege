import java.util.Scanner;

public class IO {
     public int getInput(String prompt) {
          Scanner sc = new Scanner(System.in);
          System.out.println(prompt);
          int sum = sc.nextInt(); 
          return sum;
     }
}
