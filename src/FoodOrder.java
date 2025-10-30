public class FoodOrder {
    private String foodName;
    private double price;
    private int quantity;
    private static final double TAX = 0.1; // Pajak 10%

    public FoodOrder(String foodName, double price, int quantity) {
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }
    public void calculateTotal() {
        double total = price * quantity;
        total += total * TAX;

        // Tambahkan kode diskon di SINI
        if (total > 50000) {
            System.out.println("Diskon 10% diterapkan!");
            total -= total * 0.1;
        }

        showResult(total);
    }
    private void showResult(double total) {
        System.out.println(foodName + " x" + quantity);
        System.out.println("Total (termasuk pajak): Rp " + total);
    }
}
