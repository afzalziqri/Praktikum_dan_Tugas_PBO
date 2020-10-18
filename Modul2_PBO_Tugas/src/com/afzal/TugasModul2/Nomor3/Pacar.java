package com.afzal.TugasModul2.Nomor3;

// Class Pacar yang mewariskan Class Mahasiswa
public class Pacar extends Mahasiswa {
    // Inisiasi variabel (namaPacar, lamaHubungan)
    public String namaPacar = "Rahasia dong";
    public int lamaHubungan = 0;

    // Method getStatus
    public void getStatus(){
        System.out.println("Nama Pacar\t\t: " + namaPacar);
        System.out.println("Lama Hubungan\t: " + lamaHubungan);
    }
}
