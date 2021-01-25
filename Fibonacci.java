import java.math.BigInteger;
import java.util.*;
import java.math.BigInteger;
public class Fibonacci {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter the number of fibonacci numbers to display:"); //Taking input from user
		n = sc.nextInt();
		
		if(n<=0) {
			System.out.println("Invalid input");	//If n is 0 or negative
			return;
		}
		//int p1=0,p2=1;
		
		// Taking BigInteger to avoid the limit exception of integer
		BigInteger p1 = new BigInteger("1");
		BigInteger p2 = new BigInteger("1");
		if(n==1)
		{
			System.out.println(p1);		//Printing only first number
			return;
		}
	
		else
		{
			System.out.print(p1+" "+p2+" ");	//printing first two numbers
		}
		
			for(int i=0;i<n-2;i++)				//printing succeeding numbers
			{
				BigInteger curr = p1.add(p2);
				System.out.print(curr+" ");
				p1 = p2;
				p2 = curr;
			}
		

		}catch(Exception e) {
			System.out.println("Enter valid inputs");
			//System.out.println(e);
		}
	}
}