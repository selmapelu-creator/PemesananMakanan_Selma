/**
 * Kelas Main menjalankan program utama Pemesanan Makanan.
 * Program ini membuat objek FoodOrder dan menghitung total pesanan dengan diskon.
 *
 * @author Selma
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Membuat pesanan baru (contoh)
        FoodOrder order = new FoodOrder("Nasi Goreng", 15000, 6);

        // Menghitung total harga pesanan
        order.calculateTotal();
    }
}
