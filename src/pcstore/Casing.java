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
public class Casing {
      double harga;
    
    
    public void casingDazumba(){
        System.out.println("Casing merk Dazumba Xfan");
        System.out.println("Harga : Rp 41000");
        System.out.println("----------------------------------------------");
    }
    
            
        public double hargacasingDazumba(){
        double harga = 41000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
 
    
    public void casingCoolingswift(){
        System.out.println("Casing merk Coolingswift");
        System.out.println("Harga : Rp 90000");
        System.out.println("----------------------------------------------");
    } 
            
        public double hargacasingCoolingswift(){
        double harga = 90000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
 
}
