import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of:");
        int N = input.nextInt();
        
        BigInteger res = new BigInteger("1");


       if (N<0)
          {System.out.println("Factorial cannot be found!!");}
        
      else if (N==0||N==1)
        {System.out.println("Factorial is:" + 1);
        	return;
        }
        
        for(int i = 2; i <= N; i++)
        {   
            BigInteger multiplier = new BigInteger(String.valueOf(i));
            res = res.multiply(multiplier);
        }
        if(N>0)
        System.out.println("Factorial of the given number is:"+res);
       }
     catch(Exception e)
		{System.out.println("Enter valid input");}
    
       }
     }




