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
public class PCWorkstation extends PC{

    RAM ram;
    Processor proc;
    HDD hdd;
    VGA vga;
    PowerSupply ps;
    MotherBoard mobo;
    Casing casing;
    DVD dvd;
    
    public PCWorkstation(RAM ram,
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
        deskripsi = "\n in PC Workstation";
    }
    
    public void specification(){
        System.out.println("--------------------------------------------------");
        System.out.println("|-------Detail Spesifikasi PC Workstation----------------|");
        System.out.println("--------------------------------------------------");
        ram.SANDISK8G();
        proc.AMDA8();
        hdd.TOSHIBA1T();
        vga.AMDATIRADEON2G();
        ps.PSAerocool();
        mobo.hargamoboAsrocks();
        casing.casingCoolingswift();
        dvd.dvdAsus();
    }

    public double harga() {
        double hargaram = ram.hargaSANDISK8G();
        double hargaproc =proc.hargaAMDA8();
        double hargahdd =hdd.hargaTOSHIBA1T();
        double hargavga =vga.hargaAMDATIRADEON2G();
        double hargaps = ps.hargaPSAerocool();
        double hargamobo =mobo.hargamoboAsrocks();
        double hargacasing =casing.hargacasingCoolingswift();
        double hargadvd =dvd.hargadvdAsus();
        double hargaCPU = hargaram+hargaproc+hargahdd+hargavga+hargaps+hargamobo+hargacasing+hargadvd;
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Harga PC Workstation = Rp "+hargaCPU+",-");
        return hargaCPU;
    }
    
}