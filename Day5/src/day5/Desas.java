/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author katri
 */
public class Desas {
    //ka spele cilveks ar cilveku
    //1.funckija, kas zime laukumu - tiek uzzimeta svitrina
    
    //2.izveidot ta, lai mainitos spēlētājs, kas aizpilda masivu 
    //un ievada X vai O
    //ja ievada ko citu tad paprasit velreiz while cikls
    //parbaudit uzvaras nosacijumus un beigt speli ja masivs ir aizpildits
    //drikst izpildit gajienu brivaja vieta
    
    Scanner sc = new Scanner(System.in);
    String[][] Desas = new String[3][3];
    String Gajiens = "X";
   
    
    public void masivaAizpildisana(){ //strada
        
         int z = 1;
        for( int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                Desas[i][j]=String.valueOf(z);
                z++;
            }
        }
    }
    
    public void laukums(){ //strada
        
        for( int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(Desas[i][j] + " ");
            }
            System.out.println();
        }
    }
     public void Galvenais(){
         laukums();
         
         String uzvara = "";
         
         System.out.println("Spēli sāk pirmais spēlētajs-X, ievadi ciparu, kur vēlies ievietot X - ");
         int atbilde = sc.nextInt();
         
         while (uzvara == ""){
             if (!(atbilde>0 && atbilde<=9)){
                 System.out.println("Nepareizi - ievadi velreiz");
           
                }
              
            for( int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (Desas[i][j].contains(String.valueOf(atbilde)))
                
                {
                Desas[i][j]=Gajiens;

                        if (Gajiens.equals("X")){
                        Gajiens = "O";
                        } else {
                        Gajiens = "X";
                        }
                        laukums();
                        uzvara = Parbaude();
                        
                        
                } else {
                System.out.println("VIeta jau aiznemta");
                
                        }
            } 
            }  
         }  
     } 
     //00 01 02
     //10 11 12
     //20 21 22
     
     String Parbaude(){
         for (int i=0; i<8; i++){
         String linija = null;
   
         
         switch (i){
            case 0: linija = Desas[0][0]+Desas[0][1]+Desas[0][2];
                     break;
            case 1: linija = Desas[1][0]+Desas[1][1]+Desas[1][2];
                     break;
            case 2: linija = Desas[2][0]+Desas[2][1]+Desas[2][2];
                     break;
            case 3: linija = Desas[0][0]+Desas[1][0]+Desas[2][0];
                     break;
            case 4: linija = Desas[0][1]+Desas[1][1]+Desas[2][1];
                     break;
            case 5: linija = Desas[0][2]+Desas[1][2]+Desas[2][2];
                     break;
            case 6: linija = Desas[0][0]+Desas[1][1]+Desas[2][2];
                     break;
            case 7: linija = Desas[2][0]+Desas[1][1]+Desas[0][2];
                     break;
             }
         
         if (linija.equals("XXX")){
             return "X";
         } else if (linija.equals("OOO")){
             return "O";
         }
         }
         
         for (int i =0; i<9; i++){
         if (Arrays.asList(Desas).contains(String.valueOf(i+1))){
         break;
         } else if (i==8) return "neizšķirts";
         
         }
         System.out.println("Speletaja-"+Gajiens+" gajiens, izveliesk ur novietot "+ Gajiens);
     return null;
     }
    
    /*public void Speletajs1(){
        
        
        
        //Pirmais speletajs  
        System.out.println("Spēlētāja nr.1 gājiens! ");
        System.out.println("Ievadi RINDU kurā vietā tiks ievadīts X");
        int rindaX = sc.nextInt();
        
        System.out.println("Ievadi KOLONU kurā vietā tiks ievadīts X");
        int kolonnaX = sc.nextInt();
        
        
        Desas[rindaX-1][kolonnaX-1] = "X";
        
        for( int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                
                System.out.print(Desas[i][j]);
                
            }
            System.out.println();
        }
  
    }
    
    public void Speletajs2(){
         //OTRAIS SPELETAJS
      System.out.println("Spēlētāja nr.2 gājiens! ");
        System.out.println("Ievadi RINDU kurā vietā tiks ievadīts O");
        int rindaO = sc.nextInt();
        
        System.out.println("Ievadi KOLONU kurā vietā tiks ievadīts O");
        int kolonnaO = sc.nextInt();
        
        
        Desas[rindaO-1][kolonnaO-1] = "O";
        
        for( int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                
                System.out.print(Desas[i][j]);
                
            }
            System.out.println();
        }
    }*/
    
    
    
}
