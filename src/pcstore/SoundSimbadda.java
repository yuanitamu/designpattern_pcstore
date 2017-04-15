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
public class SoundSimbadda extends equipment{
    PC pc;
    double harga;
    
    public SoundSimbadda(PC pc){
        this.pc = pc;
    }
    public String getDeskripsi() {
        return "\n + Sound System merk Simbadda Harga Rp 600000,-"+pc.getDeskripsi();
    }

    public double harga() {
        double harga = 600000;
        this.harga=harga;
        return harga+pc.harga();
    }

    
    public void specification() {
        System.out.println(getDeskripsi());
        System.out.println(harga());
    }
    
}