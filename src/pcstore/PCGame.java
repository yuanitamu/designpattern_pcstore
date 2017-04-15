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
public class PCGame extends PC{

    RAM ram;
    Processor proc;
    HDD hdd;
    VGA vga;
    PowerSupply ps;
    MotherBoard mobo;
    Casing casing;
    DVD dvd;
    
    public PCGame(RAM ram,
                  Processor proc,
                  HDD hdd,
                  VGA vga,
                  PowerSupply ps,
                  MotherBoard mobo,
                  Casing casing,
                  DVD dvd) {
        this.ram=ram;
        this.proc=proc;
        this.hdd=hdd;
        this.vga=vga;
        this.ps=ps;
        this.mobo=mobo;
        this.casing=casing;
        this.dvd=dvd;
        deskripsi = "\n in PC Game";
    }
    
    public void specification(){
        System.out.println("--------------------------------------------------");
        System.out.println("|-------Detail Spesifikasi PC Game----------------|");
        System.out.println("--------------------------------------------------");
        ram.SANDISK8G();
        proc.AMDA6();
        hdd.TOSHIBA1T();
        vga.NVIDIA2G();
        ps.PSBufftech();
        mobo.hargamoboAsrocks();
        casing.casingCoolingswift();
        dvd.dvdAsus();
    }

    public double harga() {
        double hargaram = ram.hargaSANDISK8G();
        double hargaproc =proc.hargaAMDA6();
        double hargahdd =hdd.hargaTOSHIBA1T();
        double hargavga =vga.hargaNVIDIA2G();
        double hargaps = ps.hargaPSBufftech();
        double hargamobo =mobo.hargamoboAsrocks();
        double hargacasing =casing.hargacasingCoolingswift();
        double hargadvd =dvd.hargadvdAsus();
        double hargaCPU = hargaram+hargaproc+hargahdd+hargavga+hargaps+hargamobo+hargacasing+hargadvd;
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Harga PC Game = Rp "+hargaCPU+",-");
        return hargaCPU;
    }
    
}
