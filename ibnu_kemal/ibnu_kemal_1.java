package com.ujian1.ibnu_kemal;
import java.util.Arrays;
import java.util.Collections;

public class ibnu_kemal_1 {

	public static void main(String[] args) {
		Integer[] angka = { 200000, 100000, 75000, 150000, 50000};
        Arrays.sort(angka, Collections.reverseOrder());
        for(int a : angka) {
            System.out.println("Rp. " +a+ ".00");
        }
	}
}
