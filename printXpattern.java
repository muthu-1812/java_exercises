import java.util.Scanner;
public class printXpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		    System.out.print("Enter a number : ");
		    try{
		    int size = s.nextInt();
		    if(size<1) {
		    	 System.out.println("Enter value greater than 1");
		    	 return;
		    }
		    else if(size>=99) {
		    	 System.out.println("Enter value less than or equal to 99");
		    	 return;
		    }
		    s.close();
		    printXPattern(size*2);
		    }
		    catch (Exception e) {
		      System.out.println("Enter valid input");
		    }
		    catch(OutOfMemoryError err) {
				 System.out.println("Enter valid test cases");
			 }
		    
		  }

		  private static void printXPattern(int size) {
		    for (int i = 0; i < size ; i++) {
		      for (int j = 0; j < size ; j++) {
		        if (i == j || i + j == size - 1) {
		          System.out.print("*");
		        } else {
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		     
		    }
	}

}
