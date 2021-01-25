import java.util.Scanner;
public class Palindrome {
	
	public static void main(String args[])
	{
	
	    try{
	    long num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		while(!sc.hasNextLong()){
		System.out.println("not valid!Try again");
		sc.next();}
		num=sc.nextInt();
	
		long original = num;
		long rev = 0;
		long remainder;
		
		while(num!=0) {
			remainder = num%10;
			rev = rev*10+remainder;
			num = num/10;
		}
		
		if(original==rev) {
			System.out.println("Yes, it is a palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
	    
	    }catch(Exception e) {
			 System.out.println("Enter valid test cases");
		 }
		 catch(OutOfMemoryError err) {
			 System.out.println("Enter valid test cases");
		 }
		
	}
}

