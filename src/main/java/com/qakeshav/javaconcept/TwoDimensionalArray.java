package com.qakeshav.javaconcept;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st[][]=new String[3][3];
		System.out.println(st.length);
		System.out.println(st[0].length);
		st[0][0]="a";
		st[0][1]="ab";
		st[0][2]="abc";
		st[1][0]="b";
		st[1][1]="bc";
		st[1][2]="bcd";
		st[2][0]="c";
		st[2][1]="cd";
		st[2][2]="cde";
		
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<st[i].length;j++) {
				System.out.print(" ---- "+ st[i][j]);
				
			}
		}
	}

}
