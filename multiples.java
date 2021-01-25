import java.util.Scanner;
public class multiples {
	 private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try {
					System.out.println("Enter the valid number");
					while(!sc.hasNextInt()){
					System.out.println("not valid!Try again");
					sc.next();}
					
					 
			        int N = sc.nextInt();
					if(N>=214748364 || N<=-214748364) {
						 System.out.println("Try with a smaller number");
						 return;
						
					}
			         for(int ctr = 1; ctr <= 10; ctr++){
			            long multiples = N * ctr;
			            System.out.print(N + " x " + ctr + " = " + multiples + "\n"); 
			         }
			        sc.close();
				} catch(Exception e) {
					 System.out.println("Enter valid test cases");
				 }
				 catch(OutOfMemoryError err) {
					 System.out.println("Enter valid test cases");
				 }
		  
			
		    

	}

}
