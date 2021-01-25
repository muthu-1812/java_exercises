/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package training;
import java.util.*;
/**
 *
 * @author mbashish
 */
public class SpiralMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.println("Enter int");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Printing Matrix");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++)
                System.out.print(" "+matrix[i][j]);
            System.out.println();
        }
        int r1 = 0, r2 = n-1;
        int c1 = 0, c2 = n - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) System.out.println(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) System.out.println(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) System.out.println(matrix[r2][c]);
                for (int r = r2; r > r1; r--) System.out.println(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        
        }  catch(OutOfMemoryError err) {
			 System.out.println("Out of memory error. Try with a smaller number");
		 }
        catch(Exception e) {
            System.out.println("Enter Valid Input");
        }

// TODO code application logic here
    }
    
}
