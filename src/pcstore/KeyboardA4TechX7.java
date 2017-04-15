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
public class KeyboardA4TechX7 extends equipment{
    PC pc;
    double harga;
    
    public KeyboardA4TechX7(PC pc){
        this.pc = pc;
    }
    public String getDeskripsi() {
        return "\n + Keyboard A4TechX7 Untuk Gaming Harga Rp 200000,-"+pc.getDeskripsi();
    }

    public double harga() {
        double harga = 200000;
        this.harga=harga;
        return harga+pc.harga();
    }

    
    public void specification() {
        System.out.println(getDeskripsi());
        System.out.println(harga());
    }
    
}