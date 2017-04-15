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
public class DVD {
      double harga;
    
    
    public void dvdSamsung(){
        System.out.println("DVD merk Samsung");
        System.out.println("Harga : Rp 150000");
        System.out.println("----------------------------------------------");
    }
    
            
        public double hargadvdSamsung(){
        double harga = 150000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
 
    
    public void dvdAsus(){
        System.out.println("DVD merk Asus");
        System.out.println("Harga : Rp 200000");
        System.out.println("----------------------------------------------");
    } 
    
            
        public double hargadvdAsus(){
        double harga = 200000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
 
}
