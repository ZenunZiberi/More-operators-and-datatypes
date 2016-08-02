package MoreDatatypesAndOperators;

public class MinMax {

	public static void main(String[] args) {

		int nums[]= {234,346,643,2,463,586,346,344,2,4};
		
		int min,max;
		
		min=max=nums[9];
		
		for(int i =0; i<10;i++){
			if(nums[i]<min) min =nums[i];
			if(nums[i]>max)max=nums[i];
		}
		System.out.println("min and max: "+min+" "+max);

	}

}
