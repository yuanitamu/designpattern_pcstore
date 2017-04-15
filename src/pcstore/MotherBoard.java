/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pcstore;

/**
 *
 * @author Hermawan Kusuma
 */
public class MotherBoard {
      double harga;
    
    
    public void moboAsrock(){
        System.out.println("Mother Board merk AS Rock");
        System.out.println("Harga : Rp 550000");
        System.out.println("----------------------------------------------");
    }
    
            
        public double hargamoboAsrocks(){
        double harga = 550000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
 
    
    public void moboAsus(){
        System.out.println("Mother Board merk ASUS P8H61M-E");
        System.out.println("Harga : Rp 729000");
        System.out.println("----------------------------------------------");
    } 
    
            
        public double hargamoboAsus(){
        double harga = 729000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
 
}
