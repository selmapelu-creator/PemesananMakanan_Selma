public class FoodOrder {
    private String foodName
    private double price;
    private int quantity;
    **private static final double TAX = 0.1; // Pajak 10%**

 public void calculateTotal()
    double total = price * quantity;
 total += total * TAX; //
    }


private void showResult(double total) {
    System.out.println(foodName + " x" + quantity);
       System.out.println("Total harga: Rp " + total);
  }

