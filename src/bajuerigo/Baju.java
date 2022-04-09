/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bajuerigo;

/**
 *
 * @author Zephyrus
 */
public class Baju {
    private int bajuA = 100000;
    private int bajuB = 125000;
    private int bajuC = 175000;
    
    int processA (int jumlah){
        int hasil;
        if (jumlah > 100){
            bajuA = 95000;
        }
        System.out.println("Harga per buah : " + bajuA );
        return hasil = bajuA * jumlah;
    }
    
     int processB (int jumlah){
        int hasil;
        if (jumlah > 100){
            bajuB = 100000;
        }
        System.out.println("Harga per buah : " + bajuB );
        return hasil = bajuB * jumlah;
    }
     
      int processC (int jumlah){
        int hasil;
        if (jumlah > 100){
            bajuC = 120000;
        }
        System.out.println("Harga per buah : " + bajuC );
        return hasil = bajuC * jumlah;
    }
}
