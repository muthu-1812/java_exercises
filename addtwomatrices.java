import java.util.Scanner;
public class addtwomatrices
{  
 public static void main(String[] args) 
 {
	 try {
  Scanner in= new Scanner(System.in);
  int r,c;
     System.out.println("Enter the row and column values of the matrix");
     r=in.nextInt();
     c=in.nextInt();     
     in.nextLine();
 int a[][]=new int[r][c];
 int b[][]=new int[r][c];
 int sum[][]=new int[r][c];
     System.out.println("Enter the elements for the first matrix");
     for(int i=0;i< r;i++)
         for(int j=0;j< c;j++)
             a[i][j]=in.nextInt();
             in.nextLine();
     for(int i=0;i< r;i++)
     {
        for(int j=0;j< c;j++)
         {
           System.out.print(a[i][j]+" ");
         }
          System.out.println("");
     }
     in.nextLine();
   System.out.println("Enter the elements for the second matrix");
     for(int i=0;i< r;i++)
         for(int j=0;j< c;j++)
             b[i][j]=in.nextInt();
     for(int i=0;i< r;i++)
     {
        for(int j=0;j< c;j++)
         {
           System.out.print(b[i][j]+" ");
         }
          System.out.println("");
     }
   //Finding sum
     for(int i=0;i< r;i++)
         for(int j=0;j< c;j++)
             sum[i][j]=a[i][j]+b[i][j];
  //printing the result 
System.out.println("Sum of matrix: ");  
 for(int i=0;i< r;i++)
 {
    for(int j=0;j< c;j++)
     {
       System.out.print(sum[i][j]+" ");
     }
      System.out.println("");
 }
} 
	 catch(Exception e)
{System.out.println("Enter valid input");}
 
  catch(OutOfMemoryError err) {
  System.out.println("Out of memory error. Try with a smaller number");
  }
} 
}



