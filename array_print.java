
import java.util.Scanner;

public class array_print{

	public static void main(String[] args) {
		//  Auto-generated method stub
		     
		 
		 System.out.println("Enter the number of elements of the integer array:");
		 try {

			Scanner sc = new Scanner(System.in);
		 
		         int i,n;
			 n = sc.nextInt();
			 int[] array = new int[n];
			 
			 
			     System.out.println("Enter the elements");

				sc.nextLine();
			     for(i=0;i<n;i++)
			        array[i] = sc.nextInt();
			     
			     System.out.println("The elements of the integer array are:");
			  
			        for (int element: array) 
			            System.out.println(element);

			        
			        sc.close();
		 }
		 catch(Exception e) {
			 System.out.println("Enter valid test cases");
		 }
		 catch(OutOfMemoryError err) {
			 System.out.println("Enter valid test cases");
		 }
    }
		 
}
		




