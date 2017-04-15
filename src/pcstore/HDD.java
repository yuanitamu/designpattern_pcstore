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
public class HDD {
    double harga;
    
    
    public void SEAGATE500G(){
        System.out.println("Harddisk Kapasitas 500GB merk SEAGATE");
        System.out.println("Harga : Rp 650000");
        System.out.println("----------------------------------------------");
    }
    
        public double hargaSEAGATE500G(){
        double harga = 650000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
        public void TOSHIBA640G(){
        System.out.println("Harddisk Kapasitas 640GB merk TOSHIBA");
        System.out.println("Harga : Rp 800000");
        System.out.println("----------------------------------------------");
    }
    
        public double hargaTOSHIBA640G(){
        double harga = 800000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
    
    public void TOSHIBA1T(){
        System.out.println("Harddisk Kapasitas 1TB merk TOSHIBA");
        System.out.println("Harga : Rp 845000");
        System.out.println("----------------------------------------------");
    }
    
        public double hargaTOSHIBA1T(){
        double harga = 845000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------
}
