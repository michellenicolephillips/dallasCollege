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
          String[] values = data.split(",");
          String name = values[0];
          double price = Double.parseDouble(values[1]);
          char layer = values[2].charAt(0); 
          int slot = Integer.parseInt(values[3]);
          Snack s = new Snack (name, price, layer, slot);
          return s;
     }
}
