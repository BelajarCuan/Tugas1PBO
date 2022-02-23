/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main2;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Scanner Input = new Scanner(System.in);
        int temp;
     
       System.out.println("+===========================+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+===========================+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius  = ");double 
        input = Input.nextDouble();
        Konversi kon = new Konversi ();
        kon.c = input;
      
        
        do{ 
        System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
        System.out.print("Masukan Opsi  = ");int pilih = Input.nextInt();
        temp=pilih;
        switch(pilih){
            case 1 : kon.hitung(); break;
            
            case 2 : System.out.println("\n\nInput Data");
                     System.out.println("----------");
                     System.out.print("Suhu Dalam Celcius  = ");double input1 = Input.nextDouble();
                      kon.c = input1;
                     break;
            case 3 : System.out.println("\n\nTerima Kasih :) ");break;
            
            default : System.out.println("Opsi Tidak Ada , Mohon Input Opsi Dengan Benar");
            
            
        }
       
        
    }while( temp !=3);
    
}
}
      
