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
public class VGA {
    double harga;
    
    
    public void AMDATIRADEON2G(){
        System.out.println("VGA merk AMD ATI RADEON 2GB");
        System.out.println("Harga : Rp 600000");
        System.out.println("----------------------------------------------");
    }
    
        public double hargaAMDATIRADEON2G(){
        double harga = 600000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
    
    public void NVIDIA2G(){
        System.out.println("VGA merk NVIDIA GeForce 2GB");
        System.out.println("Harga : Rp 700000");
        System.out.println("----------------------------------------------");
    }
        
        public double hargaNVIDIA2G(){
        double harga = 700000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
  
}
