

import java.util.Scanner;

public class insertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
    	try {
        int n, pos=0, x;
        
        
        System.out.print("Enter no. of elements you want in array:");
        while(!s.hasNextInt() ) {
        	System.out.println("not valid try again");
        	s.next();
        }
        n = s.nextInt();
        s.nextLine();
        
        	if(n<1) {
        		System.out.println("Enter value greater than 0");
        		return;
        	}
        	int a[] =new int[n+1];
        	
        
        
        System.out.println("Enter all the elements:");
        while(!s.hasNextInt() ) {
        	System.out.println("not valid try again");
        	s.next();
        }
       
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        
        System.out.print("Enter the  position where you want to insert element:");
        while(!s.hasNextInt() ) {
        	System.out.println("not valid try again");
        	s.next();
        }
        pos = s.nextInt();
        if(pos>n)
        {
        	System.out.println("enter the position with-in array size");
        	return;
        }
       
        
        
        
        System.out.print("Enter the element you want to insert:");
        while(!s.hasNextInt() ) {
        	System.out.println("not valid try again");
        	s.next();
        }
        x = s.nextInt();
        for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    	}
    	catch(Exception e) {
    		System.out.println("Not valid try again");
    		s.next();
    		
    	}
    	catch(OutOfMemoryError err) {
			 System.out.println("Out of memory error. Try with a smaller number");
		 }

	}

}
