
import java.util.Scanner;  
   
class LinearSearchExample2   
{  
	public static void main(String args[]){  
		
		//initialze variables
		int index, numOfElements=0, key=0, array[] = null;
		boolean found = false,goodInput = false;  
		
		Scanner scannerObject = new Scanner(System.in); 
		
		//Ask user for number of elements
		System.out.println("Enter number of elements:"); 
		while(!goodInput)
			try {
				numOfElements = scannerObject.nextInt();   
				array = new int[numOfElements];  
				System.out.println("Enter those " + numOfElements + " elements(1 element in 1 line only, other space separated values will be ignored):");  
				goodInput = true;
			}catch(Exception e) {
			   	System.out.println("Unprocessable input recieved! Please enter another one");
			}
			finally {
				scannerObject.skip(".*");
			}
		
		//Ask user to enter elements
		index = 0;
		while(index < numOfElements)  
			try {
				array[index] = scannerObject.nextInt();
				index++;
			}catch(Exception e) {
		    	System.out.println("Input not acceptable please enter another one.");
			}
			finally {
				scannerObject.skip(".*");
			}

		//Ask user to enter elements   
		System.out.println("Enter value to find:");
		goodInput=false;
		while(!goodInput)
			try {
				key = scannerObject.nextInt();  
				goodInput = true;
			}catch(Exception e) {
				System.out.println("Input not acceptable please enter another one.");
			}
			finally {
				scannerObject.skip(".*");
			}
		
		//linear search logic
		for (index = 0; index < numOfElements; index++)  
			if (array[index] == key){  
				System.out.println("present at location " + (index + 1) + ".");  
				found = true;  
			}
		if(!found)
			System.out.println(key + " isn't present in array.");  
		
		scannerObject.close();
	 }
}  