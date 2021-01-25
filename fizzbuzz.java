// package prog;
import java.util.Scanner;
public class fizzbuzz {

	public static void main(String[] args) {

		try{
					Scanner s = new Scanner(System.in);
					System.out.println("Enter number:"); 
					int n = s.nextInt();
					if(n > 1 && n < 100) {
					System.out.println("The FizzBuzz numberswill be: ");			
				for (int i = 1; i <= n; i++) {				
					if (i % 3 == 0 && i % 5 == 0) { //multiple of 3 & 5
							System.out.print("FizzBuzz");
					} else if (i % 3 == 0) { //multiple of 3
							System.out.print("Fizz");
					} else if (i % 5 == 0) { //multiple of 5
							System.out.print("Buzz");
						} else {
							System.out.print(i);
						}
						System.out.print(" ");
					}
					s.close();
					}
				
				else{
					System.out.println("Please enter proper input, Try Again!!");
				}
			}
			catch(Exception e)
			{
				System.out.println("Enter valid inputs");
			}
		}

	}


