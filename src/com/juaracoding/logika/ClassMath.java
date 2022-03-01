package com.juaracoding.logika;

import java.util.Scanner;

public class ClassMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double a,b,c;
        Scanner scan= new Scanner(System.in);
 
        System.out.print("Masukkan angka: ");
        a = scan.nextDouble();
        System.out.print("Masukkan angka 2: ");
        b = scan.nextDouble();
        System.out.print("Masukkan pangkat: ");
        c = scan.nextDouble();
        
        Double square = Math.sqrt(a);
        System.out.println("Akar Kuadrat dari "+ a + " adalah "+ square);
        
        Double pangkat = Math.pow(b, c);
        System.out.println("Pangkat "+ c +" dari "+ b + " adalah "+ pangkat);
	}

}
