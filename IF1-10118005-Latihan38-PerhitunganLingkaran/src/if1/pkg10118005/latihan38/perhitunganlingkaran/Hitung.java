/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Hitung {
    Scanner sc = new Scanner(System.in);
	private double diameter;
	
	public void inputDiameter(){
		System.out.println("======Perhitungan Lingkaran=====");
		System.out.print("Masukkan nilai diameter lingkaran : ");
		while (!sc.hasNextDouble()){
			System.out.println("Nilai Diameter Tidak Sesuai\n");
			System.out.print("Masukkan nilai diameter lingkaran : ");
			sc.next();	
	}
	}
	public void output(){
		diameter = sc.nextDouble();
		System.out.println("\n=======Hasil Perhitungan Lingkaran======");
		System.out.println("Jari-jari Lingkaran = " + (diameter/2) + " cm");
		System.out.println("Luas Lingkaran = " + (3.14*(diameter/2)*(diameter/2)) + " cm");
		System.out.println("Keliling Lingkaran = " + (3.14*diameter) + " cm");
	}
    }
