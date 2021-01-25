import java.util.*;
import java.util.Arrays;
public class BubbleSort {

		public static void main(String args[]) {
			int n;
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.println("Enter the size of array");
				n = sc.nextInt();
				
				
					int a[] = new int[n];
					sc.nextLine();
					System.out.println("Enter the array elements");
					for(int i=0;i<n;i++) {
						a[i] = sc.nextInt();
					}
					
					for(int i=0;i<n;i++) {
						for(int j=0;j<n;j++) {
							if(a[i]<a[j]) {
								int temp = a[i];
								a[i] = a[j];
								a[j] = temp;
							}
						}
					}
					
					System.out.println("Soted array elements");
					for(int i=0;i<n;i++) {
						System.out.print(a[i]+" ");
					}
					
				
			}catch(Exception e) {
				System.out.println("Invalid inputs");
			}
			catch(OutOfMemoryError err) {
				System.out.println("Out of memory error. Try with a smaller number");
			}
		}
}
