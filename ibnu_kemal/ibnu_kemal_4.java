package com.ujian1.ibnu_kemal;
import java.util.Scanner;

public class ibnu_kemal_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Masukan Tinggi Piramida: ");
        int tinggi = input.nextInt();
        System.out.print("Masukan Lebar Piramida: ");
        int lebar = input.nextInt();
        for(int t=1; t<=tinggi; t++){
            for(int s=t; s<=lebar; s++){
                System.out.print(" ");
            }
            
            for(int b=0; b<=(t*2)-2; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
