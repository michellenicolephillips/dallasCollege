package firstProject;
import java.util.Scanner;

public class Main {
     static MyFirstClass myFirstClassInstance = new MyFirstClass(10);
     public static void main (String[] args) {
          System.out.println("Enter your name:");
          Scanner getInput = new Scanner(System.in);
          String yourName = getInput.nextLine();
          System.out.println(MyFirstClass.aStr + " " + yourName + "! The number is " + myFirstClassInstance.aInt + ".");
      }
}
