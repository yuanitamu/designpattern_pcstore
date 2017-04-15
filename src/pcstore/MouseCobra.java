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
public class MouseCobra  extends equipment{
    PC pc;
    double harga;
    
    public MouseCobra(PC pc){
        this.pc = pc;
    }
    public String getDeskripsi() {
        return "\n + Mouse Votre Harga Rp 150000,-"+pc.getDeskripsi();
    }

    public double harga() {
        double harga = 150000;
        this.harga=harga;
        return harga+pc.harga();
    }

    
    public void specification() {
        System.out.println(getDeskripsi());
        System.out.println(harga());
    }
    
}

