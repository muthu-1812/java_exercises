import java.util.Scanner;
import java.util.Arrays;
class BinarySearch
{
   public static void main(String args[])
   {
      int counter, num, item, first, last, middle;
     
     
      try {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:"); //Size of the inpu tarray
      num = input.nextInt(); 

      if(num<=0 || num>=2147483647) {
    	  System.out.println("Invalid number of Elements!!!");  //Negative number is not valid
    	  return;
      }
      
      int array[] = new int[num];
      input.nextLine();
      System.out.println("Enter sorted " + num + " integers");
      
      for (counter = 0; counter < num; counter++)
          array[counter] = input.nextInt();			//Taking array of elements input from user
      
      int sortedArray[] = array;
      Arrays.sort(sortedArray);				//Sorting the array

   
      System.out.println("Enter the search value:");	//Number to be searched
      item = input.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;		//Calculating the middle index of array

      // Binary Search Algorithm
      
      while( first <= last )
      {
         if ( array[middle] < item )
           first = middle + 1;
         else if ( array[middle] == item )		// Value found
         {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }catch(Exception e) {
	   System.out.println("Input values are not valid");
   }
   catch(OutOfMemoryError err) {
    System.out.println("Out of memory error. Try with a smaller number");
  }
}
}