import java.util.Scanner;
/**
 * Kelas utama untuk menjalankan aplikasi toko bangunan.
 * Aplikasi ini memungkinkan pengguna untuk melihat daftar barang di toko,
 * membeli barang, dan mengelola stok barang setelah pembelian.
 */
public class Main {
    /**
     * Metode utama untuk menjalankan aplikasi toko bangunan.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menambahkan stok beberapa barang
        Barang paku = new Barang("Paku", 100, 500);
        Barang palu = new Barang("Palu", 50, 15000);
        Barang cat = new Barang("Cat", 40, 45000);
        Barang batu = new Barang("Batu", 200, 1000);
        Barang semen = new Barang("Semen", 100, 75000);

        // Menampilkan informasi barang yang tersedia di toko
        System.out.println("Daftar Barang di Toko:");
        paku.tampilkanInfo();
        palu.tampilkanInfo();
        cat.tampilkanInfo();
        batu.tampilkanInfo();
        semen.tampilkanInfo();

        // Input data pembelian dari pengguna
        System.out.print("\nMasukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();

        System.out.print("Masukkan nama barang yang ingin dibeli: ");
        String namaBarangDibeli = scanner.nextLine();

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahDibeli = scanner.nextInt();

        System.out.print("Masukkan persentase diskon: ");
        double persentaseDiskon = scanner.nextDouble();

        // Logika untuk memilih barang berdasarkan nama
        Barang barangDibeli = null;
        switch (namaBarangDibeli.toLowerCase()) {
            case "paku":
                barangDibeli = paku;
                break;
            case "palu":
                barangDibeli = palu;
                break;
            case "cat":
                barangDibeli = cat;
                break;
            case "batu":
                barangDibeli = batu;
                break;
            case "semen":
                barangDibeli = semen;
                break;
            default:
                System.out.println("Barang tidak ditemukan.");
                scanner.close();
                return;
        }

        // Membuat objek Pembelian jika barang ditemukan dan stok cukup
        if (barangDibeli != null && jumlahDibeli <= barangDibeli.getStok()) {
            Pembelian pembelian = new Pembelian(namaPembeli, barangDibeli, jumlahDibeli);

        } else {
            System.out.println("Stok tidak mencukupi atau barang tidak ditemukan.");
        }

        // Menampilkan stok barang setelah pembelian
        System.out.println("\nStok barang setelah pembelian:");
        paku.tampilkanInfo();
        palu.tampilkanInfo();
        cat.tampilkanInfo();
        batu.tampilkanInfo();
        semen.tampilkanInfo();

        scanner.close();  // Menutup scanner
    }
}
