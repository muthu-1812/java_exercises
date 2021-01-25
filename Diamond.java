import java.util.Scanner;
public class Diamond
{
public static void main(String args[])
{
    try{
            int n, i, j, space = 1;
            System.out.print("Enter the number of rows: ");
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            if(n>73)
            {
                System.out.println("Enter Smaller number");
                return;
            }
            space = n - 1;
            for (j = 1; j<= n; j++)
            {
            for (i = 1; i<= space; i++)
            {
            System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
            System.out.print("*");
            }
            System.out.println("");
            }
            space = 1;
            for (j = 1; j<= n - 1; j++)
            {
            for (i = 1; i<= space; i++)
            {
            System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (n - j) - 1; i++)
            {
            System.out.print("*");
            }
            System.out.println("");
            }
    }
        catch(Exception e)
        {
            System.out.println("Enter valid inputs");

        }
        catch(OutOfMemoryError err) {
            System.out.println("Out of memory error. Try with a smaller number");
        }
}
}