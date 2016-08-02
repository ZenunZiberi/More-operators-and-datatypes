package MoreDatatypesAndOperators;

public class TwoDimensionals {

	public static void main(String[] args) {

		int i,j;
		int table[][]=new int[5][5];
		for(i=0;i<5;i++){
			for (j=0;j<5;j++){
				table [i][j]=(j*5)+i+1;
				System.out.print(table [i][j]+" ");
			}
			System.out.println();
		}

	}

}
