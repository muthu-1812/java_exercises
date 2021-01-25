import java.util.Scanner;  

class noofonebits {
  public static void main(String[] args) {
    try{
    
     Scanner s = new Scanner(System.in); 
	
    System.out.println("Enter no");
	while(!s.hasNextLong()){
	System.out.println("not valid!Try again");
	s.next();}
	
    int c=0;

    long n=s.nextLong();
    //s.close();
    if(n<0)
    {
      System.out.println("Invalid Input");
      return;
    }
	
    while(n!=0)  
    {

        c++;
        // if((n&1)!=0) c++;
        // n>>=1;
        n=n&(n-1);
		
        

    }
    System.out.println(c);
    }catch(Exception e) {
			 System.out.println("Enter valid test cases");
		 }
		 catch(OutOfMemoryError err) {
			 System.out.println("Enter valid test cases");
		 }
   
	
  }
}
