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
public class PowerSupply {
   double harga;
    
    
    public void PSAerocool(){
        System.out.println("Power Supply merk Aerocool E78-430W");
        System.out.println("Harga : Rp 292000");
        System.out.println("----------------------------------------------");
    }
    
            
        public double hargaPSAerocool(){
        double harga = 292000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
 
    
    public void PSBufftech(){
        System.out.println("Power Supply merk Bufftech 450W");
        System.out.println("Harga : Rp 67000");
        System.out.println("----------------------------------------------");
    } 
    
           
        public double hargaPSBufftech(){
        double harga = 67000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
 
}
