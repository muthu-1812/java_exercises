
import java.util.Scanner;
import java.util.Arrays;

public class countelement
{
	
public static void main(String[] args) {

try{
		
Scanner s = new Scanner(System.in);

System.out.println("Enter the size of the array:");

int n = s.nextInt();	

int a[] = new int[n];

s.nextLine();
if(n==0)
{System.out.println("No element found in the array!!");
return;
}

else
System.out.println("Enter the elements in the array:");
	    
for(int i = 0;i<n;i++){
	        
a[i] = s.nextInt();
	       	    
}
if(n>0)
System.out.println("Enter the element whose count is to be found in the array");

int k = s.nextInt();

int c = 0;

for(int i = 0;i<n;i++){
	        
if(k == a[i]){
	            
c++;
	        
}

} 

if(c==0 && n>0)
System.out.println("Element not found in the array!!");


else if(c!=0)
System.out.println("The number of times the element has been repeated:" + c);	 
} 
catch(Exception e) {
            System.out.println("Enter valid input");	
}
catch(OutOfMemoryError err)
{System.out.println("Out of memory error. Try with a smaller number!");}
}
}