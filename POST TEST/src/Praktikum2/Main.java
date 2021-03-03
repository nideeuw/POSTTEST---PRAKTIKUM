/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

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
        Pohon cemara = new Pohon();
        Pohon kelapa = new Pohon();
        
        cemara.setNama();
        cemara.setTinggi();
        kelapa.setNama();
        kelapa.setTinggi();
        System.out.println(" ");
        
        cemara.getNama();
        cemara.getTinggi();
        System.out.println(" ");
        kelapa.getNama();
        kelapa.getTinggi();
    }
    
}
