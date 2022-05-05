import java.util.ArrayList;
import java.util.Collections;

public class Snack {
     private String name;
     private double price;
     private char layer;
     private int slot;

     public Snack (String name, double price, char layer, int slot) {
          this.name = name;
          this.price = price;
          this.layer = layer;
          this.slot = slot;
     }

     public String getName() {
          return name;
     }

     public double getPrice() {
          return price;
     }

     public  char getLayer() {
          return layer;
     }
     
     public int getSlot() {
          return slot;
     }

     static Snack parseStringToSnack(String data) {
          ArrayList<String> values = new ArrayList<String>();
          Collections.addAll(values, data.split(","));
          String name = values.get(0);
          double price = Double.parseDouble(values.get(1));
          char layer = values.get(2).charAt(0); 
          int slot = Integer.parseInt(values.get(3));
          Snack s = new Snack (name, price, layer, slot);
          return s;
     }
}
