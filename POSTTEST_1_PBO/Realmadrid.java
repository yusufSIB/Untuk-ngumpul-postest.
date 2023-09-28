/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author 62812
 */
class Realmadrid {
    private final String nama;
    private final String posisi;
    private final String nomor;
    private final String umur;
    
    public Realmadrid(String nama, String posisi, String nomor, String umur) {
        this.nama = nama;
        this.posisi = posisi;
        this.nomor = nomor;
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public String getPosisi() {
        return posisi;
    }
    public String getNomor(){
        return nomor;
    }
    public String getUmur(){
        return umur;
    }
    @Override
    public String toString() {
        return "Nama Pemain: " + nama + "\nPosisi: " + posisi + "\nNomor Punggung: " + nomor + "\numur: " + umur + "\n";
    }

}


