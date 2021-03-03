/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Kendaraan {
    //nama pemilik, jenis, cc, brand, warna
    static String nama,jenis,brand,warna;
    static int cc;
    
    static void data(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nama pemilik: ");
        nama = input.nextLine();
        System.out.print("Masukkan jenis kendaraan: ");
        jenis = input.nextLine();
        System.out.print("Masukkan brand kendaraan: ");
        brand = input.nextLine();
        System.out.print("Masukkan warna kendaraan: ");
        warna = input.nextLine();
        System.out.print("Masukkan cc kendaraan: ");
        cc = input.nextInt();
    }
    static void cetak(){
        System.out.println(" ");
        System.out.println("=========DATA KENDARAAN=========");
        System.out.println("Nama pemilik    : "+nama);
        System.out.println("Jenis kendaraan : "+jenis);
        System.out.println("Brand kendaraan : "+brand);
        System.out.println("Warna kendaraan : "+warna);
        System.out.println("CC kendaraan    : "+cc);
    }
    
}
