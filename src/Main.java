import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner untuk input dari user
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Selma's Resto 🍽️ ===");
        System.out.print("Masukkan nama makanan: ");
        String foodName = sc.nextLine();

        System.out.print("Masukkan harga satuan: ");
        double price = sc.nextDouble();

        System.out.print("Masukkan jumlah pesanan: ");
        int quantity = sc.nextInt();

        System.out.println("\n=== Ringkasan Pesanan ===");
        FoodOrder order = new FoodOrder(foodName, price, quantity);
        order.calculateTotal();

        sc.close(); // Tutup scanner
    }
}
