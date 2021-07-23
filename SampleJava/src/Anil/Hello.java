package Anil;

import java.util.Scanner;

public class Hello {
	
	    static int getSum(int n) 
	    {     
	        int sum = 0; 
	        while (n != 0) 
	        { 
	            sum = sum + n % 10; 
	            n = n/10; 
	        } 
	    return sum; 
	    } 
	    
	    public static void main(String[] args)  {
	        Scanner sc = new Scanner(System.in);
	        int T=sc.nextInt();
	        for(int l=1; l<=T; l++){
	            int num=sc.nextInt();
	             System.out.println(getSum(num));
	        }
	        sc.close();
	        }
}
