/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author katri
 */
public class Uzdevums {
    
    public void interfeiss(){ //int iepriekš bija bet peksni negaja
        
        Scanner sc = new Scanner(System.in);
                            
        System.out.println("Ievadi skaitli - ");
        int skaitlis = sc.nextInt();
        System.out.println("Ievadi pakapi - ");
        int pakape = sc.nextInt();

        int rezultats = kapinasana(skaitlis, pakape);

        System.out.println("rezultats" + rezultats);  
    }
    
    private int kapinasana(int skaitlis, int pakape){
        int rezultats = 1;
        
        for (int i=0; i<pakape; i++){
            rezultats = rezultats*skaitlis;
        }
        return rezultats;
    }
    
    public void masivuIzvade(){
    
        int[] masivs = new int[5]; //masivs ar noteiktam vertibam
        masivs[0] = 4;
        masivs[1] = 3;
        masivs[2] = 2;
        masivs[3] = 7;
        masivs[4] = 99;
        
        //System.out.println(masivs[0]);
        
        for (int i=0; i<masivs.length; i++){ // leinght varam pieklut katrai vertibai
            System.out.println(masivs[i]);
                    
        }
    }
    
}
