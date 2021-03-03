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
public class Persegi {
    int sisi;
    
    void hitung(){
        Scanner input = new Scanner (System.in);
        System.out.println("MENGHITUNG LUAS PERSEGI");
        System.out.print("Masukkan nilai sisi: ");
        sisi = input.nextInt();
        System.out.println("Luas persegi: "+sisi*sisi);
        
    }
    
}
