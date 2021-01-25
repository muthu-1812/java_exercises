
import java.util.Scanner;

class insertionsort {
    public static void main(String[] args) {
    	
    	//initializations and declarations
    	boolean goodInput = false;
    	int arr[] = null, n = 0, i;
    	
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        // taking in array size and reserving space
        while(!goodInput)
			try {
				n = s.nextInt();
				arr = new int[n];
				goodInput = true;
			}catch(Exception e) {
			   	System.out.println("Unprocessable input recieved! Please enter another one");
			}
			finally {
				s.skip(".*");
			}
        
        System.out.println("Enter those " + n + " elements(1 element in 1 line only, other space separated values will be ignored):");
		// taking in array elements
        i = 0;
		while(i < n)  
			try {
				arr[i] = s.nextInt();
				i++;
			}catch(Exception e) {
		    	System.out.println("Input not acceptable please enter another one.");
			}
			finally {
				s.skip(".*");
			}
        s.close();
        
        //insertion sort logic
        for(i=1;i<n;i++)
        {
            
            int tmp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > tmp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
        
        //printing sorted array
        System.out.println("Sorted array:");
        for(int x:arr)
        {
            System.out.println(x+" ");
        }
        
    }
}