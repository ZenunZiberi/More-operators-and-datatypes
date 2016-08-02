package MoreDatatypesAndOperators;

public class Array2 {

	public static void main(String[] args) {

		int num1[]=new int[10];
		int num2[]=new int[10];
		
		int i;
		for(i=0;i<num1.length;i++)
			num1[i]=i;
		
		if(num1.length<=num2.length)
		for(i=0;i<num1.length;i++)
			num2[i]=num1[i];
		
		for(i=0;i<num2.length;i++)
			System.out.println(num1[i]);
	}

}
