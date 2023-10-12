package MinumanManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */

import Minuman.Minuman;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 62812
 */
public class MinumanManager {
    private List<Minuman> daftarMinuman;
    private int nextId;

    public MinumanManager() {
        daftarMinuman = new ArrayList<>();
        nextId = 1;
    }

    public void tambahMinuman(String nama, double harga, int stok) {
        Minuman minuman = new Minuman(nextId, nama, harga, stok);
        daftarMinuman.add(minuman);
        nextId++;
    }

    public Minuman bacaMinuman(int id) {
        for (Minuman minuman : daftarMinuman) {
            if (minuman.getId() == id) {
                return minuman;
            }
        }
        return null;
    }

    public void updateMinuman(int id, String nama, double harga, int stok) {
        for (Minuman minuman : daftarMinuman) {
            if (minuman.getId() == id) {
                minuman.setNama(nama);
                minuman.setHarga(harga);
                minuman.setStok(stok);
                break;
            }
        }
    }

    public void hapusMinuman(int id) {
        Minuman minumanTerhapus = null;
        for (Minuman minuman : daftarMinuman) {
            if (minuman.getId() == id) {
                minumanTerhapus = minuman;
                break;
            }
        }
        if (minumanTerhapus != null) {
            daftarMinuman.remove(minumanTerhapus);
        }
    }

    public List<Minuman> bacaSemuaMinuman() {
        return daftarMinuman;
    }
}

