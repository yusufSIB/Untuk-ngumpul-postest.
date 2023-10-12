package TokoMinuman;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */

import MinumanManager.MinumanManager;
import Minuman.Minuman;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author 62812
 */
public final class AplikasiTokoMinuman {
    public static void main(String[] args) {
        final MinumanManager manager = new MinumanManager();
        final Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa minuman awal ke dalam ArrayList
        manager.tambahMinuman("Root Bear", 15000, 10);
        manager.tambahMinuman("Milo", 5000, 15);
        manager.tambahMinuman("Ice Tea", 3000, 20);

        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Tambah Minuman");
            System.out.println("2. Baca Minuman");
            System.out.println("3. Update Minuman");
            System.out.println("4. Hapus Minuman");
            System.out.println("5. Baca Semua Minuman");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            final int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Minuman: ");
                    final String nama = scanner.nextLine();
                    System.out.print("Masukkan Harga Minuman: ");
                    final double harga = scanner.nextDouble();
                    System.out.print("Masukkan Stok Minuman: ");
                    final int stok = scanner.nextInt();
                    manager.tambahMinuman(nama, harga, stok);
                    System.out.println("Minuman telah ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan ID Minuman: ");
                    final int id = scanner.nextInt();
                    final Minuman minuman = manager.bacaMinuman(id);
                    if (minuman != null) {
                        System.out.println("Nama: " + minuman.getNama() + ", Harga: " + minuman.getHarga() + ", Stok: " + minuman.getStok());
                    } else {
                        System.out.println("Minuman tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan ID Minuman yang ingin diupdate: ");
                    final int idUpdate = scanner.nextInt();
                    System.out.print("Masukkan Nama Baru Minuman: ");
                    final String namaUpdate = scanner.nextLine();
                    System.out.print("Masukkan Harga Baru Minuman: ");
                    final double hargaUpdate = scanner.nextDouble();
                    System.out.print("Masukkan Stok Baru Minuman: ");
                    final int stokUpdate = scanner.nextInt();
                    manager.updateMinuman(idUpdate, namaUpdate, hargaUpdate, stokUpdate);
                    System.out.println("Minuman telah diupdate.");
                    break;
                case 4:
                    System.out.print("Masukkan ID Minuman yang ingin dihapus: ");
                    final int idHapus = scanner.nextInt();
                    manager.hapusMinuman(idHapus);
                    System.out.println("Minuman telah dihapus.");
                    break;
                case 5:
                    final List<Minuman> daftarMinuman = manager.bacaSemuaMinuman();
                    System.out.println("Daftar Minuman:");
                    for (final Minuman m : daftarMinuman) {
                        System.out.println("ID: " + m.getId() + ", Nama: " + m.getNama() + ", Harga: " + m.getHarga() + ", Stok: " + m.getStok());
                    }
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

