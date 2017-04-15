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
public abstract class PC {
	String deskripsi = "Unknown PC Specifications";
  
	public String getDeskripsi() {
		return deskripsi;
	}
 
        public abstract void specification();
	public abstract double harga();
}

