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
public class Processor {
       double harga;
    
     public void IntelAtom(){
        System.out.println("Processor Intel Atom dengan Kecepatan...");
        System.out.println("Harga : Rp 700000");
        System.out.println("----------------------------------------------");
    }
    
        public double hargaIntelAtom(){
        double harga = 700000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
    
    public void IntelCoreI5(){
        System.out.println("Processor Intel Atom dengan Kecepatan...");
        System.out.println("Harga : Rp 1000000");
        System.out.println("----------------------------------------------");
    }
    
        public double hargaIntelCoreI5(){
        double harga = 1000000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
    
    public void AMDA6(){
        System.out.println("Processor AMD A6 dengan Kecepatan...");
        System.out.println("Harga : Rp 1050000");
        System.out.println("----------------------------------------------");
    }
        public double hargaAMDA6(){
        double harga = 1050000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
        
           public void AMDA8(){
        System.out.println("Processor AMD A8 dengan Kecepatan...");
        System.out.println("Harga : Rp 1550000");
        System.out.println("----------------------------------------------");
    }
        public double hargaAMDA8(){
        double harga = 1550000;
        this.harga=harga;
        return harga;
    }
}
