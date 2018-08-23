/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

/**
 *
 * @author katri
 */
public class Piemers {
    
    public void Divdimensiju(){
        Scanner sc = new Scanner(System.in);
        int[] OneD = new int[5]; //viendimensiju massivs ar 5 vertibam
        
        int[][] TwoD = new int[2][2]; //dievdimensiju masivs ar 5 rindam un 5 kolonam
        
        for( int i=0; i<2; i++){
            for (int j=0; j<2; j++){
               /* System.out.println("Rinda - " + i);
                System.out.println("Kolonna - " + j);
                System.out.println("----");*/
               System.out.println("Ievadi skaitli -");
                TwoD[i][j]=sc.nextInt(); // piešķiram rindam vertibas
            }
        }
        
        for( int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print(TwoD[i][j]);
              
            }
            System.out.println();
        }
        
        
    }
    
    
}
