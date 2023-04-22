/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_output_formatting;
import java.util.Scanner;
/**
 *
 * @author imran
 */
public class Java_Output_Formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.print(s1);
                for(int j = 0; j < 15 - s1.length(); j++){
                    System.out.print(" ");
                }
                String s2 = "" + x;
                for(int k = 0; k < 3 - s2.length(); k++){
                    System.out.print("0");
                }
                System.out.println(s2);
            }
            System.out.println("================================");
    }
}
