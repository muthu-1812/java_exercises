import java.util.Scanner;
public class Prime {
	 static boolean isPrime(long n) 
	 {	 
 
		 if (n <= 1) { 
		 
			 return false;
			 
		 }

 
		 for (int i = 2; i < n; i++) { 
			 if (n % i == 0) { 
				 return false;
			 }
		 }

		 return true; 
	 } 

 
	 static void printPrime(long n) 
	 { 
		 for (int i = 0; i <= n; i++) 
		 { 
			 if (isPrime(i)) 
				 System.out.print(i + " "); 
			 
		 } 
	 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 long n;
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the Positive number");
			 while(!sc.hasNextLong()){
			 System.out.println("not valid!Try again");
			 sc.next();}
			
		
		
			 n = sc.nextLong();
			if(n<=1)
			{
			System.out.println("Invalid Input!");}
			 Prime p = new Prime();
			 
			Prime.printPrime(n);
		} catch(Exception e) {
			 System.out.println("Enter valid test cases");
		 }
		 catch(OutOfMemoryError err) {
			 System.out.println("Out of memory error. Try with a smaller number");
		 }
		
		
	}

	

}
