package MoreDatatypesAndOperators;

public class Sum {

	public static void main(String[] args) {
	
		int nums[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20	};
		int sum=0;
		
		for (int i =0;i<nums.length;i++)
			sum=sum+nums[i];
		System.out.println(sum);

		double simple[]={1,2,3,4,5,6,7,8,9,10};
		int summa=0;
		System.out.print("Value is: ");
		for(double a:simple) {
			
			System.out.print(a+" , ");
			summa+=a;
			if(a==5)break;
		}
		System.out.println("Summation is: "+summa);
		
}
}