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
public class PCStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RAM ram=new RAM();
        Processor proc = new Processor();
        HDD hdd=new HDD();
        VGA vga = new VGA();
        PowerSupply ps = new PowerSupply();
        MotherBoard mobo = new MotherBoard();
        Casing casing = new Casing();
        DVD dvd = new DVD();
        //============================================================================
        PC game = new PCGame(ram,proc,hdd,vga,ps,mobo,casing,dvd);
        game.specification();
        game = new MonitorAcer19(game);
        game = new MouseCobra(game);
        game = new KeyboardA4TechX7(game);
        game = new SoundSimbadda (game);
        
        System.out.println("----------------------------------------------");
        System.out.println("Equipments :"+game.getDeskripsi());
        System.out.println("Harga Total Keseluruhan + Equipment : Rp "+game.harga()+",-");
        System.out.println("---------------------------------------------------\n\n");
        
        //============================================================================
        
        PC office = new PCOffice(ram,proc,hdd,vga,ps,mobo,casing,dvd);
        office.specification();
        office = new MonitorAcer19(office);
        office = new MouseVotre(office);
        office = new KeyboardAcer(office);
        office = new SoundLogitech (office);
        
        System.out.println("----------------------------------------------");
        System.out.println("Equipments :"+office.getDeskripsi());
        System.out.println("Harga Total Keseluruhan + Equipment : Rp "+office.harga()+",-");
        System.out.println("---------------------------------------------------\n\n");
        
        //============================================================================
        PC workstation = new PCWorkstation(ram,proc,hdd,vga,ps,mobo,casing,dvd);
        workstation.specification();
        workstation = new MonitorAcer19(workstation);
        workstation = new MouseCobra(workstation);
        workstation = new KeyboardA4TechX7(workstation);
        workstation = new SoundSimbadda (workstation);
        
        System.out.println("----------------------------------------------");
        System.out.println("Equipments :"+workstation.getDeskripsi());
        System.out.println("Harga Total Keseluruhan + Equipment : Rp "+workstation.harga()+",-");
        System.out.println("---------------------------------------------------\n\n");
        
        //============================================================================
    }
    
}
