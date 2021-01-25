import java.util.Scanner;

public class HalfPyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size or number of rows:");
	    try {
	    while(!sc.hasNextInt() ) {
	    	System.out.println("not valid try again");
	    	sc.next();
	    }
	    rows = sc.nextInt();
	    
	    if(rows>99)
	    {
	    	System.out.println("enter smaller number");
	    	return;
	    }
	    
	    }
	    catch(OutOfMemoryError er) {
	    	System.out.println("enter the smaller number");
	    }
	    if(rows<=0) {
	    	System.out.println("enter a valid number");
	    }

	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }

	}

}
