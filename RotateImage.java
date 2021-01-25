/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package training;

import java.util.Scanner;

/**
 *
 * @author mbashish
 */
public class RotateImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix  n");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        sc.nextLine();
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
        
        for(int i=0;i<n/2;i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n-1-i];
            matrix[n-1-i] = temp;
        }
        
        
        //Transposing 
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        System.out.println("Printing Matrix");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++)
                System.out.print(" "+matrix[i][j]);
            System.out.println();
        }
        }catch(OutOfMemoryError err) {
			 System.out.println("Out of memory error. Try with a smaller number");
		 } 
        catch(Exception e) {
            System.out.println("Enter Valid Input");
        }
// TODO code application logic here
    }
    
}
