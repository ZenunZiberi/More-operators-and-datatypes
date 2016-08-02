package MoreDatatypesAndOperators;

public class AverageTest {

	public static void main(String[] args) {
			
		double num[]={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
		double sum=0;
		for(int i=0;i<num.length;i++){
			sum=sum+num[i];
			System.out.println("Average of num: "+sum/num.length );
		
	}
}
} 