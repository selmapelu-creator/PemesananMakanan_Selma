/**
 * Kelas FoodOrder merepresentasikan pemesanan makanan di restoran.
 * Menyimpan data nama makanan, harga, jumlah pesanan, dan menghitung total harga.
 * Termasuk perhitungan pajak 10% dan fitur diskon 10% jika total di atas Rp50.000.
 *
 * @author Selma
 * @version 1.1
 */
public class FoodOrder {
    private String foodName;
    private double price;
    private int quantity;
    private static final double TAX = 0.1; // Pajak 10%

    /**
     * Konstruktor untuk membuat objek FoodOrder baru.
     * @param foodName nama makanan yang dipesan
     * @param price harga satuan makanan
     * @param quantity jumlah pesanan
     */
    public FoodOrder(String foodName, double price, int quantity) {
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Menghitung total harga pesanan termasuk pajak dan diskon (jika berlaku).
     * Diskon 10% akan diterapkan jika total setelah pajak melebihi Rp50.000.
     * Setelah dihitung, hasilnya akan ditampilkan melalui method showResult().
     */
    public void calculateTotal() {
        double total = price * quantity;
        total += total * TAX;

        // Fitur baru: diskon 10% kalau total di atas Rp50.000
        if (total > 50000) {
            System.out.println("Diskon 10% diterapkan!");
            total -= total * 0.1;
        }

        showResult(total);
    }

    /**
     * Menampilkan hasil akhir dari total harga pesanan.
     * @param total total harga yang sudah termasuk pajak dan diskon (jika ada)
     */
    private void showResult(double total) {
        System.out.println(foodName + " x" + quantity);
        System.out.println("Total (termasuk pajak & diskon): Rp " + total);
    }
}
