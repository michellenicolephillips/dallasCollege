import java.lang.Math;
import java.util.Scanner;

public class Loan {
     //loan amount
     static double p;
     //loan term in years
     static double n;
     //loan in terms of months
     static double x;
     //loan rate per year
     static double rate;
     //rate per period
     static double r;
     //amount per pay period
     static double a;


     public static double calculatePayment() {
           //calculate rate as decimal for percentage to work
          rate = rate * .01;
          r = rate/12;
          //calculate monthly payment for equation to work
          x = n * 12;
          a = p * (r * (Math.pow((1+r), x))) / (Math.pow((1+r), x)-1);
          return a;
     }
     public static double calculateTotalCost() {
          double totalCost;
          totalCost = a * x;
          return totalCost;
     }

     public static double calculateTotalInterest() {
          double totalInterest;
          totalInterest = calculateTotalCost() - p;
          return totalInterest;
     }


     public static void main (String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter loan amount:");
          p = sc.nextDouble();
          System.out.println("Your loan amount is " + p);
          System.out.println("Please enter interest rate;");
          rate = sc.nextDouble();
          System.out.println("Your interest rate is " + rate);
          System.out.println("Please enter loan term in years:");
          n = sc.nextDouble();
          System.out.println("Your loan term is " + n + " years");
          System.out.println("Your monthly payment is " + calculatePayment());
          System.out.println("Your total amount due is " + calculateTotalCost());
          System.out.println("Your total interest is " + calculateTotalInterest());
     }
}