import java.util.Scanner;
import java.util.Arrays;

public class sumarray
{ 

public static void main(String[] args) {

try{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        s.nextLine();
       System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++) {
            arr[i] = s.nextInt();
        }
        
        int sum=0;
        for(int a:arr) {
            sum+=a;
            
        }


  if(n==0)
   { System.out.print("Size of the array is zero, no input possible");
     return ;
   }
    else
    System.out.println("sum of the array elements:"+sum);
    
    
  } catch(Exception e) {
            System.out.println("Enter valid input");
        }
    catch(OutOfMemoryError err) {
			 System.out.println("Out of memory error. Try with a smaller number");
		 }
    }
    
}