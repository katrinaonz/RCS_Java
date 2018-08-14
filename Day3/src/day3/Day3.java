/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author katri
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        Zvaiznes();
       /*Daudzsturis figura = new Daudzsturis(); //objekts
        figura.PrivateMalas();
            
        if (figura.maluSkaits <= 2 || figura.maluSkaits >5) {
            System.out.println("Nepareiz malu skaits! ");}
        else {
        
        figura.Malas();
        
        double perimetrs = figura.Perimetrs();
        System.out.println("Perimetrs ir "+ perimetrs);*/
        
        //abas fuksijas vareja taisit ar return un tad viena tieekuma var uzrakstit visu
        // un ieklaut to if, lai parbauditu vai nav kluda -
        //ja ir tad ozvada kluda,
        //ja nav tad izvada teikumu
        
    }
    
    static void Zvaiznes()
    {
         Scanner obj = new Scanner(System.in);
        System.out.println("Ievadi rindu skaitu - ");
        int skaitlis = obj.nextInt();
        int stttt = skaitlis;
        String zvaizne = "*";
        int i = 0;
        
        while (i <= skaitlis){
            for(int j=0; j<i; j++){
                System.out.print(zvaizne);
             //stringus var plusot zvaiznite = zvainznite + "*"                
            }
        System.out.println();
        i++;
        }
        
        String sv="";
        for (int k=5; k>stttt; k--){
            sv = sv + "*";
            System.out.println(sv);
            
        }
        
      
        
    }
    
}
