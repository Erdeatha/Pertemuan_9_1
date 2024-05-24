/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Putra
 */

import java.util.Scanner;

public class TestSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan sisi-sisi segitiga
        System.out.print("Masukkan sisi1 segitiga: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi2 segitiga: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi3 segitiga: ");
        double sisi3 = input.nextDouble();

        // Meminta pengguna memasukkan warna dan properti terisi
        System.out.print("Masukkan warna segitiga: ");
        String warna = input.next();
        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean terisi = input.nextBoolean();

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        // Menampilkan properti segitiga
        System.out.println("Luas segitiga adalah: " + segitiga.getLuas());
        System.out.println("Keliling segitiga adalah: " + segitiga.getKeliling());
        System.out.println("Warna segitiga adalah: " + segitiga.getWarna());
        System.out.println("Apakah segitiga terisi: " + segitiga.isTerisi());
    }
}
