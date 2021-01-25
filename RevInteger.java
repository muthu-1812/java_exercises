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
public class RevInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
        System.out.println("Enter Integer");
        int x = sc.nextInt();
//        if(x < 0) x = -1*x;
        int rev = 0;
        boolean flag = false;
        while (x != 0) {
            int pop = x % 10;
            
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
                System.out.println("Integer too big"); 
                flag = true;
                break;
            } 
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                System.out.println("Integer too small");
                flag = true;
                break;
            } 
            rev = rev * 10 + pop;
        }
        
        if(!flag)
        System.out.println("Reverse "+rev);
        } catch (Exception e) {
            System.out.println("Enter Valid Input");
        }// TODO code application logic here
    }
    
}
