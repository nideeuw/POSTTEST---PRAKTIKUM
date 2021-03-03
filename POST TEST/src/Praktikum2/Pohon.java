/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Pohon {
    String nama;
    int tinggi;
    
    void setNama(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama pohon: ");
        nama = input.nextLine();
    }
    void setTinggi(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan tinggi pohon: ");
        tinggi = input.nextInt();
    }
    void getNama(){
        System.out.println("Nama pohon: "+nama);
    }
    void getTinggi(){
        System.out.println("Tinggi pohon: "+tinggi+" m");
    }
}
