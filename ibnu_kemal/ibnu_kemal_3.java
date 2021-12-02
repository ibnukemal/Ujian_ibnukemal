package com.ujian1.ibnu_kemal;
import java.util.Scanner;

public class ibnu_kemal_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Segitiga: ");
        int x = scan.nextInt();
        System.out.print("Masukkan Lebar Segitiga: ");
        int y = scan.nextInt();
        for (int a = x; a >= 1; a--) {
        	for(int b = y; b >= a; b--) {
        		System.out.print(b);
        	}System.out.println(" ");
        }

	}

}
