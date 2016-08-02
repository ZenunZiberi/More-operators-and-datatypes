package MoreDatatypesAndOperators;

public class StringArray {

	public static void main(String[] args) {

		String str[] = { "This", "is", "a","test."};
		
		System.out.println("Original array: ");
		for(String s:str)
			System.out.print(s+" ");
		System.out.println("\n");
		
		//change a string
		str[1]="was";
		str[3]="test, to! ";
		
		System.out.println("Modified array: ");
		for(String b:str)
			System.out.print(b+" ");
	}

}
