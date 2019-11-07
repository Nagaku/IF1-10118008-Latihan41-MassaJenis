/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class IF110118008Latihan41MassaJenis {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Kubus kubus = new Kubus();
		Scanner sc = new Scanner(System.in);
		System.out.println("======Massa Jenis Kubus======");
		System.out.print("Sisi : ");
		kubus.setSisi(sc.nextInt());
		System.out.print("Massa : ");
		kubus.setMassa(sc.nextInt());
		
		System.out.println("Hasil Perhitungan");
		System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
		System.out.println("Massa Jenis : " +kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
	}
	
}
