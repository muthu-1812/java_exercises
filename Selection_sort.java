import java.util.Scanner;

class Selection_sort {
    public static void main(String[] args) {

   
        


        
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Array size");
            int n=s.nextInt();
            s.nextLine();
            int ar[]=new int[n];
            System.out.println("Enter elements");
            for(int i=0;i<n;i++)
            {
                ar[i]=s.nextInt();

            }
            s.close();
        

           

            for(int i=0;i<n;i++)
            {
                int min_idx=i;
                for(int j=i+1;j<n;j++)

                {
                    if(ar[j]<ar[min_idx])
                    { 
                        min_idx=j;


                    }

                }
                int temp=ar[min_idx];
                ar[min_idx]=ar[i];
                ar[i]=temp;
            }


        
       
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    } catch(Exception e)
    {
        System.out.println("Enter valid input ");

    }
    catch(OutOfMemoryError err) {
        System.out.println("Out of memory error. Try with a smaller number");
    }
    }
}
