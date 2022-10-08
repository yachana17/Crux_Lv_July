package Interview_Ques;

public class Swap_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Swap Two Number in 5 Different Way
		   
		int a= 10;
		int b= 20;
		System.out.println("Before swapping value:"+a+" "+b);
         //Using Third Variable
		int t=a;
		    a=b;
		    b=t;
		    System.out.println("After Swapping"+a+" "+b);
	  // Without Using Third Variable
		     a= a+b;
		     b=a-b;
		     a=a-b;
		     System.out.println("After Swapping"+a+" "+b);
	  // use * and division operation
		     a=a*b;//10*20=200
		     b=a/b;//200/20=10;
		     a=a/b;//200/10=20
		     System.out.println("After Swapping"+a+" "+b);
	 // using bitwise operator
		  a=a^b;
		  b=a^b;
		  a=a^b;
		  System.out.println("After Swapping"+a+" "+b);
		// logic5 - Single statement
		  b=a+b-(a=b);
		  System.out.println("After Swapping"+a+" "+b);


		  
	
	
	
	
	
	}

}
