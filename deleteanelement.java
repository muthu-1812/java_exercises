import java.util.Scanner;
import java.util.Arrays;

public class deleteanelement
{
public static void main(String args[])
 { try{
 Scanner sc = new Scanner(System.in);
 
         int i,n,pos;
 
 System.out.println("Enter the number of elements of the array:") ;
 n = sc.nextInt();
 int[] a = new int[n];
 sc.nextLine();
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
     }
if(n==0)
System.out.println("No elements present in the array!!"); 

else
 System.out.println("Enter the position of the number which is to be deleted");
 sc.nextLine();
 pos = sc.nextInt();
 if(pos>=n||pos<0)
     { System.out.println("Invalid position entered, operation not possible");
	return;
     }
 


 for(i=pos;i<n-1;i++)
   {
     	
         a[i]=a[i+1];
   }
     n=n-1;
    
System.out.println("\n The array after deletion is: \n");
 
    for(i=0;i<n;i++) 
     {      
            System.out.print(a[i]+" ");
     
     }
     sc.close();
} catch(Exception e)
{System.out.println("Enter valid input");}
catch(OutOfMemoryError err)
{System.out.println("Out of memory error. Try with a smaller number!");}
}
}