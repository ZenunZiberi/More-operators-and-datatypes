package MoreDatatypesAndOperators;

public class SubString {

	public static void main(String[] args) {

		String obj = "Java makes web moving and alive";
		String hbo =new String(obj);
		String sub=hbo.substring(3,12);   //create new string with  substring
		
		System.out.println(obj);
		System.out.println(hbo);
		System.out.println(sub);

	}

}
