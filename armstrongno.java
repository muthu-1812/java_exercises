import java.util.Scanner;


class armstrongno {
    public static void main(String[] args) {
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter no.");
            int n=s.nextInt();
            int temp=n;
            int sum=0;

            int d=0;

            while(temp!=0)
            {

               
                temp/=10;
                d++;
            }


            temp=n;
            while(temp!=0)
            {   int r=temp%10;
                sum+=Math.pow(r,d);
                temp/=10;

            }

            if(sum==n)
                System.out.println("True");
            else
                System.out.println("False");    
            s.close();    
        }
        catch(Exception e)
        {
            System.out.println("Enter Valid input");
        }
        catch(OutOfMemoryError err) {
            System.out.println("Out of memory error. Try with a smaller number");
        }
    }
}