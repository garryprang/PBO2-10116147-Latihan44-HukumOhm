/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan44.hukumohm;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan perhitungan pada baterai dengan hukum ohm.
 */

public class Baterai {
   private float kuatArus;
   private float hambatan;
   
   public Baterai() {
       System.out.println("Hukum Ohm:\n"
               + "Kuat arus yang mengalir pada suatu kawat penghantar\n"
               + "akan berbanding lurus dengan potensial pada\n"
               + "ujung-ujung kawat penghantar tersebut\n"
               + "asalkan suhu kawat dijaga konstan.");
   }
   
   public Baterai(float kuatArus, float hambatan) {
       this.kuatArus = kuatArus;
       this.hambatan = hambatan;
   }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
   
   public float hitungTegangan() {
       return kuatArus * hambatan;
   }
}
