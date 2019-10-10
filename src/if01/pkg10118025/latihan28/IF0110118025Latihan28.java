/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan28;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String awal, baru, cari, ganti;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat\t : ");
        awal = scan.nextLine();
        System.out.print("Ganti Kata\t\t : ");
        cari = scan.nextLine();
        System.out.print("Menjadi Kata\t\t : ");
        ganti = scan.nextLine();
        
        baru = awal.replace(cari, ganti);
        System.out.println("\n====Hasil Formatting====");
        System.out.print("Kalimat Awal\t : " + awal);
        System.out.print("\nKalimat Baru\t : " + baru);
        System.out.println("");
    }
    
}
