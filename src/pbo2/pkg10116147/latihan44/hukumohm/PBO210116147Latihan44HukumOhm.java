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

public class PBO210116147Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai baterai = new Baterai();
        Baterai baterai1 = new Baterai(3,12);
        System.out.println();
        System.out.println("Kuat Arus\t: " + baterai1.getKuatArus() + " ampere");
        System.out.println("Hambatan\t: " + baterai1.getHambatan() + " ohm");
        System.out.println("Tegangan\t: " + baterai1.hitungTegangan() + " volt");
    }
    
}
