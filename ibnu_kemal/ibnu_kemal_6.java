package com.ujian1.ibnu_kemal;
import java.util.Scanner;
import java.util.Arrays;

public class ibnu_kemal_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Masukkan Jumlah Elemen :");
	     int jumlahelemen = input.nextInt();
	     int[]array = new int[jumlahelemen];
	     System.out.print("Masukkan Semua Elemen :");
	     for(int i=0;i <jumlahelemen;i++){
	         array[i] =input.nextInt();
	     }
	     Arrays.sort(array);
	     for(int index:array){
	         System.out.println(index);
	    }

	}

}
