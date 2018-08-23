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
public class Day5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Desas pie = new Desas();
        //pie.Divdimensiju();
        pie.masivaAizpildisana();
        //pie.Speletajs1();
        //Parbaude();
        
        pie.Galvenais();
        
        
        
        
        
    }
    public static void Parbaude(){
        Scanner sc = new Scanner(System.in); 
        Desas pie = new Desas();
        boolean k = true;
        
        while (k = true){
            
            System.out.println("Spēlētāja nr.2 gājiens! ");
        System.out.println("Ievadi RINDU kurā vietā tiks ievadīts O");
        int rindaO = sc.nextInt();
        
        System.out.println("Ievadi KOLONU kurā vietā tiks ievadīts O");
        int kolonnaO = sc.nextInt();
        
        int reiz = rindaO*kolonnaO;
        
        if (!(reiz>0 && reiz<=9)){
            System.out.println("Nepareizz cipars ievadi velreiz");
            
        }else if(pie.Desas[rindaO-1][kolonnaO-1].equals("_ ")){
            pie.Desas[rindaO-1][kolonnaO-1]="O";
            
            for( int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                
                System.out.print(pie.Desas[i][j]);
                
            }
                    
            System.out.println();
        }
            k = false;
        }else { 
            System.out.println("Aizpildits, ievadi velreiz - ");
        }
        
        }
    
    }
    
}
