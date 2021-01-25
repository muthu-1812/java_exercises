// package prog;
import java.util.Scanner;
import java.util.*;
public class duplicatenumbers {  
    public static void main(String[] args) {  

        try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number");
                int no = sc.nextInt();
                HashSet<Integer> dupSet = new HashSet<Integer>();
                sc.nextLine();
                if(no > 1){
                    int arr[] = new int[no]; 
                    System.out.println( "Enter " + no + " numbers");
                for(int i = 0; i < no; i++){
                    arr[i] = sc.nextInt();
                }
        
            System.out.println("Duplicate elements in given array: ");  
            //Searches for duplicate element  
            for(int i = 0; i < arr.length; i++)
             {  
                 
                    if(dupSet.contains(arr[i]))
                        {
                         System.out.print(arr[i]+" ");  
                        }
                    else{
                        dupSet.add(arr[i]);
                    }
                
            }
                
            for(int num: dupSet)
                System.out.println(num);
            }
            else{
                System.out.println("Enter the number greater than 1, Try Again");
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter valid input");

        }
        catch(OutOfMemoryError err) {
            System.out.println("Out of memory error. Try with a smaller number");
        }
      }  
}  