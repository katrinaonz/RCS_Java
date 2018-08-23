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
        Scanner sc = new Scanner(System.in);
                            
        //int[] masivs = new int[5]; //masivs ar noteiktam vertibam
        /*masivs[0] = 4;
        masivs[1] = 3;
        masivs[2] = 2;
        masivs[3] = 7;
        masivs[4] = 99;*/
        
        //System.out.println(masivs[0]);
        
        System.out.println("Ievadi rindu skaitu - ");
        int sk = sc.nextInt();
        String[] masivs = new String[sk]; 
        String zv = "";
        
        
        for (int i=0; i<masivs.length; i++){ // leinght varam pieklut katrai vertibai
   
           for (int k=masivs.length; k>=i; k--){
               System.out.print(" ");
           }
            masivs[i] = zv;
            System.out.println(masivs[i]);
            zv = (zv + "**");  //vareja noradit ar zv[i]=zv[i-1]+"*" -- bet tad tas jaieliek if, jo 0 elements bus -1 kas nenostradas
            
        }
         
        for (int k=sk-1; k>=0; k--){
            
            for (int u=masivs.length; u>=k; u--){
               System.out.print(" ");
              
           }
           System.out.println(masivs[k]);
        
        }
        
        
    }
    public void Masivi2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi rindu skaitu - ");
        int sk = sc.nextInt();
        int z = 1;
        //int e = 1;
        int[] masivs = new int[sk];
        
        for (int i= 0; i<=masivs.length; i++){
            
            masivs[i]=z;
            z = z + 1;
        }
        
        for (int k=sk-1; k>=0; k--){
            
            for (int j=5; j>k; j--){
            
                System.out.print(masivs[j]);
                
            }
            System.out.println();
        
        }
    }
}
