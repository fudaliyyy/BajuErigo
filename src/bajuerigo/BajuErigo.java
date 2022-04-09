/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bajuerigo;
import java.awt.BorderLayout;
import java.util.Scanner;    
/**
 *
 * @author Zephyrus
 */
public class BajuErigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String input = scan.next();
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        int stok = scan.nextInt();
        
        Baju total = new Baju ();
        
        switch(input){
            case "a":
                System.out.println("Total harga : " + total.processA(stok));
                break;
            case "b":
                System.out.println("Total harga : " + total.processB(stok));
                break;
            case "c":
                System.out.println("Total harga : " + total.processC(stok));
                break;
        }
    }
}
