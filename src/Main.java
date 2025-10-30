/**
 * Kelas Main berfungsi sebagai titik awal (entry point)
 * untuk menjalankan program pemesanan makanan.
 * Program ini membuat objek FoodOrder dan menghitung total harga pesanan.
 *
 * @author Selma
 * @version 1.0
 */
public class Main {
    /**
     * Method utama untuk menjalankan program.
     * @param args argumen baris perintah (tidak digunakan di sini)
     */
    public static void main(String[] args) {
        // Membuat pesanan baru
        FoodOrder order = new FoodOrder("Nasi Goreng", 15000, 6);

        // Menghitung total harga pesanan
        order.calculateTotal();
    }
}
