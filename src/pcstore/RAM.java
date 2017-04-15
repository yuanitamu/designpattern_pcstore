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
public class RAM {
    double harga;
    
    
    public void VGEN2G(){
        System.out.println("RAM Kapasitas 2GB merk VGEN");
        System.out.println("Harga : Rp 200000");
        System.out.println("----------------------------------------------");
    }
    
    public double hargaVGEN2G(){
        double harga = 200000;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------    
    public void SANDISK4G(){
        System.out.println("RAM Kapasitas 4GB merk SanDisk");
        System.out.println("Harga : Rp 470500");
        System.out.println("----------------------------------------------");
    }
    
    public double hargaSANDISK4G(){
        double harga = 470500;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------    
        public void SANDISK8G(){
        System.out.println("RAM Kapasitas 8GB merk SanDisk");
        System.out.println("Harga : Rp 770500");
        System.out.println("----------------------------------------------");
    }
    
    public double hargaSANDISK8G(){
        double harga = 770500;
        this.harga=harga;
        return harga;
    }
//------------------------------Produk Lain------------------------------------------    

}
