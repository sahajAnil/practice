package Anil;

public class SahajAnil {
	//method declaration
private void anil(){};

//variable declaration
	/*
	 * String sar; String hi; String[] arry = {"SahajANil","ANIL","CHINNARI"};
	 * 
	 * public static boolean main(String a, String b) { String sar; sar="SahajAnil";
	 * sar="Anil"; String dear="SahajAnil"; //sar == dear
	 * System.out.println("Hi today!"); return true; }
	 */
	public static void main(String[] args) {
	//testing
		//test 2
		String sar;
		sar="SahajAnil";
		sar="Anil";
		sar="Chinnari";
		String dear="SahajAnil";
		String[] arry = {"SahajANil","ANIL","CHINNARI"};
		//sar == dear
		System.out.println( sar);
		for (int i=0; i<arry.length; i++) {
			System.out.println( arry[i]);
			
		}
		int j[] = {1,2,3};
		
		for(String lopalaItemsArraylo  : arry) {
			System.out.println(lopalaItemsArraylo );
		}
	}
}
