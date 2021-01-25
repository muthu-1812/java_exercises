import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        System.out.println("Enter array size");
	        int n = 2;
	        try {
	        	n = s.nextInt();
				s.nextLine();
	        if(n>1) {
	        	int ar[]=new int[n];
		        System.out.println("Enter array");
		        for(int i=0;i<n;i++)
		        {
		        	ar[i]=s.nextInt();
		        }


		        for(int i = 0; i<n; i++) {
		        	for(int j = i+1; j<n; j++) {
		        		if(ar[i]<ar[j]) {
		        			int temp = ar[i];
		        			ar[i] = ar[j];
		        			ar[j] = temp;
		        		}
		        	}
		        }
		        int b=0;
		        while(true) {
		        	if(ar[0] == ar[b]) {
		        		b++;
		        		continue;
		        	}else
		        	{
		        		System.out.println(ar[b]);
		        		break;
		        	}
		        }
		        s.close();
	        }else {
	        	System.out.println("Enter valid array size | Array size cannot be less than 2");	
	        }
	        
	        }
	        catch(Exception e) {
	        	System.out.println("Enter valid test cases");
	        	s.close();
	        }
	        catch(OutOfMemoryError err) {
				 System.out.println("Enter valid test cases");
			 }

	    }

	
}
