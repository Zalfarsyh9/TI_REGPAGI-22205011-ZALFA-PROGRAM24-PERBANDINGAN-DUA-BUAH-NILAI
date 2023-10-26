/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi22205011.latihan24.zalfa.java;
import java.util.Scanner;
/**
 *
 * @author User 
 Nama : Zalfa Rosiyah Riski 
 Nim : 22205011
 Prodi : Teknik Informatika
 */
public class TI_REGPAGI22205011Latihan24ZalfaJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        
        while(ulangi){
            System.out.println("Masukan nilai pertama\t: ");
            int nilai1 = input.nextInt();
            System.out.println("Masukan nilai kedua\t: ");
            int nilai2 = input.nextInt();
            
            if(nilai1 > nilai2) {
                System.out.println(nilai1+ "Lebih besar dari" +nilai2);
            } else if(nilai1 < nilai2) {
                System.out.println(nilai1+"Lebih kecil dari" +nilai2);
            } else {
                System.out.println(nilai1+"sama dengan" +nilai2);
            }
            
            System.out.println("ulangi aktifitas? (ya/tidak)");
            String aktifitas = input.next();
            if(aktifitas.equals("ya")) {
                System.out.println("Program akan diulangi");
            } else if (aktifitas.equals("tidak")) {
                System.out.println("Program berhasil Terimakasih");
                ulangi = false;
            }
        }
    }
}
