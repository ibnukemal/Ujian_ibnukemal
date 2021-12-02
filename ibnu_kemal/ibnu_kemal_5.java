package com.ujian1.ibnu_kemal;
import java.util.Scanner;

public class ibnu_kemal_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		String y;
		boolean lanjut = true;
		System.out.print("Masukkan Angka Sepuasnya : ");
		while (lanjut ) {
			y = input.next();
			if(y.equalsIgnoreCase("X")) {
				lanjut = false;
			} else {
				x = x + Integer.parseInt(y);
			}
		}
		System.out.println(x);	
	}
}
