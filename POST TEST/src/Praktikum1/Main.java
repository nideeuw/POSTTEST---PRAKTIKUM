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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("MENGHITUNG LUAS BANGUN");
        System.out.println("Silahkan pilih angka dibawah ini: ");
        System.out.println("1.Lingkaran");
        System.out.println("2.Persegi");
        System.out.print("Pilihan anda=> ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.println(" ");
                Lingkaran luas = new Lingkaran ();
                luas.hitung();
                break;
            case 2:
                System.out.println(" ");
                Persegi luas1 = new Persegi ();
                luas1.hitung();
                break;
            default: 
                System.out.println("Tidak ada dalam pilihan");
                break;
                
        }
        
    }
    
}
