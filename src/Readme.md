# TokoBangunan

## Deskripsi Proyek
Proyek ini adalah aplikasi sederhana yang dirancang untuk mengelola inventaris barang di sebuah toko bangunan. Pengguna dapat menambahkan barang baru, melihat informasi barang, melakukan transaksi pembelian, dan menghitung stok barang yang tersisa setelah pembelian. Proyek ini sudah melalui proses refactoring untuk meningkatkan keterbacaan kode dan pemisahan fungsi.

## Fitur Utama
- **Pengelolaan Barang**: Menyimpan data barang, termasuk nama, stok, dan harga barang.
- **Transaksi Pembelian**: Membuat transaksi pembelian dengan menghitung total harga berdasarkan jumlah barang yang dibeli dan mengurangi stok secara otomatis.
- **Antarmuka TokoBangunan**: Menggunakan interface `TokoBangunan` untuk menampilkan informasi umum dari kelas `Barang` dan `Pembelian`.

## Struktur Kelas
- `Barang.java`: Kelas untuk merepresentasikan barang di toko bangunan. Memiliki metode untuk menghitung total harga, menghitung stok setelah pembelian, dan menampilkan informasi barang.
- `Pembelian.java`: Kelas untuk membuat transaksi pembelian, menyimpan informasi pembeli, barang yang dibeli, jumlah, dan total harga.
- `Main.java`: Kelas utama untuk menjalankan aplikasi. Mengambil input dari pengguna untuk menambah barang dan melakukan pembelian.
- `TokoBangunan.java`: Interface yang mendefinisikan metode `tampilkanInfo` untuk menampilkan informasi tentang objek yang mengimplementasikannya.

## Prasyarat
Pastikan Anda memiliki:
- **Java Development Kit (JDK)** versi 8 atau lebih baru.
- **Git** (jika ingin meng-clone repositori Git dari GitHub).

## Cara Instalasi
1. **Clone repositori ini**:
   ```bash
   git clone https://github.com/muhammadsenopati/modul3.git
