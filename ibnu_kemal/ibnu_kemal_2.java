package com.ujian1.ibnu_kemal;

public class ibnu_kemal_2 {

	public static void main(String[] args) {
		for(int i=0; i<=3; i++)
        {
            for(int j=0; j<=3; j++)
                {
                    if (i==0||i==3||j==0||j==3)
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            System.out.println("");
        }

	}

}
