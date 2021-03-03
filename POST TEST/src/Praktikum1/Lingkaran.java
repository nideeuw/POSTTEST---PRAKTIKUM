/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Lingkaran {
    int d,r;
    double phi = 3.14;
    
    void hitung (){
        Scanner input = new Scanner (System.in);
        System.out.println("MENGHITUNG LUAS LINGKARAN");
        System.out.println("Ingin menghitung menggunakan apa? Pilih angka dibawah ini");
        System.out.println("1.Diameter");
        System.out.println("2.Jari-jari (r)");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1: 
                System.out.print("Masukkan nilai diameter: ");
                d = input.nextInt();
                System.out.println("Apakah nilai diameter termasuk kelipatan tujuh? ");
                System.out.print("Jawab ya/tidak: ");
                String jawab = input.next();
                if (jawab.equalsIgnoreCase("ya")){
                    System.out.println("Luas Lingkaran: "+d*d*1/4*22/7);
                }
                else if (jawab.equalsIgnoreCase("tidak")){
                    System.out.println("Luas Lingkaran: "+d*d*1/4*phi);
                }
                else{
                    System.out.println("Tidak termasuk dalam pilihan");
                }
                break;
            case 2:
                System.out.print("Masukkan nilai jari-jari (r): ");
                r = input.nextInt();
                System.out.println("Apakah nilai jari-jari (r) termasuk kelipatan tujuh? ");
                System.out.print("Jawab ya/tidak: ");
                String jawab1 = input.next();
                if (jawab1.equalsIgnoreCase("ya")){
                    System.out.println("Luas Lingkaran: "+r*r*22/7);
                }
                else if (jawab1.equalsIgnoreCase("tidak")){
                    System.out.println("Luas Lingkaran: "+r*r*phi);
                }
                else{
                    System.out.println("Tidak termasuk dalam pilihan");
                }
                break;
            default: 
                System.out.println("Tidak ada dalam pilihan");
                break;
        }
        
    }
}
