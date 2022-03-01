package com.juaracoding.logika;

import java.util.Scanner;

public class ClassPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double a;
        Scanner scan= new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        a = scan.nextDouble();
         
        Double square = Math.pow(a, 2);
        System.out.println("Square of "+ a + " is: "+ square);
	}

}
