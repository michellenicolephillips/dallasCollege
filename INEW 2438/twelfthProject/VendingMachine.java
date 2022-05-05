import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class VendingMachine {

     private static ArrayList<Snack> loadSnacks() {
          ArrayList<Snack> snacks = new ArrayList<Snack>(17);
          try(Scanner sc = new Scanner(new File("data1.txt"))) {
               for (int i = 0; i < 17; i++) {
                    String data =sc.nextLine();
                    snacks.add(i,Snack.parseStringToSnack(data));
               }
          } catch (FileNotFoundException e) {
               System.out.println("An error occured.");
          }
          System.out.print(snacks.toString());
          return snacks;
     }

     private static String getCode(ArrayList<Snack> snacks) {
          Scanner sc = new Scanner(System.in);
          for (int i = 0; i < snacks.size(); i++) {
               if (i % 5 == 0) {
                    System.out.println();
               }
               System.out.print(snacks.get(i).getLayer());
               System.out.print(snacks.get(i).getSlot());
               System.out.print(" ");
          }
          System.out.println();
          System.out.println("Please enter code for snack:");
          return sc.nextLine();
     }

     private static double getMoney() {
          Scanner sc = new Scanner(System.in);
          System.out.println("$1 bill, press 1");
          System.out.println("$5 bill, press 2");
          System.out.println("$20 bill, press 3");
          System.out.println("If done, press 0");
          double payment = 0.0;
          while(true) {
               double bill = getBill(sc.nextInt());
               if (bill < 0) {
                    break;
               }
               payment += bill;
               System.out.println("You paid $" + payment);
          }
          return payment;
     }

     private static double getBill(int bill) {
          switch(bill) {
               case 1:
                    return 1.0;
               case 2:
                    return 5.0;
               case 3:
                    return 20.0;
               case 0:
                    return -1.0;
          }
          return bill;
     }

     private static Snack getSnackByCode(ArrayList<Snack> snacks, String snackCode) {
          char[] code = snackCode.toCharArray();
          for (int i = 0; i < snacks.size(); i++) {
               if (snacks.get(i).getLayer() == code[0]) {
                    int slot = code[1] - '0';
                    if (snacks.get(i).getSlot()== slot) {
                         return snacks.get(i);
                    }
               }
          }
          return null;
     }

     private static void processSale(Snack s, double payment) {
          double price = s.getPrice();
          double change = payment - price;
          double changeAsCents = change * 100;
          int fiveDollarBill = 0;
          int oneDollarBill = 0;
          int quarter = 0;
          if (change < 0) {
               System.out.println("Need more money to purchase");
          } else if (change == 0) {
               System.out.println("You purchased " + s.getName());
          } else {
               fiveDollarBill = (int) changeAsCents / 500;
               changeAsCents = changeAsCents % 500;
               oneDollarBill = (int) changeAsCents / 100;
               changeAsCents = changeAsCents % 100;
               quarter = (int) changeAsCents / 25;
               System.out.println("You purchased " + s.getName());
               System.out.println("Your change is " + fiveDollarBill + " $5 bills, " + oneDollarBill
           + " $1 bills, and " + quarter + " quarters.");
          }
     }

     public static void saveSale(Snack s) {
          try {
               FileWriter fw = new FileWriter("sales.txt", true);
               BufferedWriter output= new BufferedWriter(fw);
               output.write(s.getName() + " ");
               output.write(s.getPrice() + "\n");
               output.close();
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
     public static void main (String[] args) {  
          while (true) { 
               ArrayList<Snack> snacksToChoose = loadSnacks();
               String snackCode = getCode(snacksToChoose);
               double payment = getMoney();
               Snack s = getSnackByCode(snacksToChoose, snackCode);
               processSale(s, payment);
               saveSale(s);
          } 
     }
}
