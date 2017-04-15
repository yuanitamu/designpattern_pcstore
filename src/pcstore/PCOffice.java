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
public class PCOffice extends PC{

    RAM ram;
    Processor proc;
    HDD hdd;
    VGA vga;
    PowerSupply ps;
    MotherBoard mobo;
    Casing casing;
    DVD dvd;
    
    public PCOffice(RAM ram,
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
        deskripsi = "\n in PC Office";
    }
    
    public void specification(){
        System.out.println("--------------------------------------------------");
        System.out.println("|-------Detail Spesifikasi PC Office----------------|");
        System.out.println("--------------------------------------------------");
        ram.VGEN2G();
        proc.IntelAtom();
        hdd.SEAGATE500G();
        ps.PSBufftech();
        mobo.hargamoboAsus();
        casing.casingDazumba();
        dvd.dvdSamsung();
    }

    public double harga() {
        double hargaram = ram.hargaVGEN2G();
        double hargaproc =proc.hargaIntelAtom();
        double hargahdd =hdd.hargaSEAGATE500G();
        double hargaps = ps.hargaPSBufftech();
        double hargamobo =mobo.hargamoboAsus();
        double hargacasing =casing.hargacasingDazumba();
        double hargadvd =dvd.hargadvdSamsung();
        double hargaCPU = hargaram+hargaproc+hargahdd+hargaps+hargamobo+hargacasing+hargadvd;
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Harga PC Office = Rp "+hargaCPU+",-");
        return hargaCPU;
    }
    
}
