/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.java_loops_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author imran
 */
public class Java_Loops_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int[] array = new int[n];
            array[0] = a + (int)Math.pow(2, 0) * b;
            System.out.print(array[0] + " ");
            for(int k = 1; k < n; k++){
                array[k] = array[k - 1] + (int)Math.pow(2, k) * b;
                System.out.print(array[k] + " ");
            }
            System.out.print("\n");
        }
        
        in.close();
    }
}
