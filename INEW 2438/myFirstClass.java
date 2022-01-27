import java.util.Scanner;

public class myFirstClass {
    int alnt;
    static String aStr = "Hello";
    public myFirstClass () {
        alnt = 0;
    }
    public static void main (String[] args) {
        System.out.println("Enter your name:");
        Scanner getInput = new Scanner(System.in);
        String yourName = getInput.nextLine();
        int alnt = 10;
        System.out.println(aStr + " " + yourName + "! The number is " + alnt + ".");
    }
}