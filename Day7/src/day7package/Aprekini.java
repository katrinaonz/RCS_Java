/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7package;

/**
 *
 * @author katri
 */
public class Aprekini {
    
    public String Aprekinat(int a, int b, String darbiba){ //labak vareja ar int
        String rezultats = ""; //ja apakasa ir return errors tad piekir tuksu vertiu tam
        //GUI_ ggg = new GUI_();
        
        if(darbiba.equals("+")){
           rezultats = String.valueOf(a+b); 
        }
        
        if (darbiba.equals("-")){
            rezultats = String.valueOf(a-b);
        }
        if (darbiba.equals("*")){
            rezultats = String.valueOf(a*b);
        }
        if (darbiba.equals("/")){
            rezultats = String.valueOf(a/b);
        }
        
        int summa = 1;
        if (darbiba.equals("x")){
            for(int i=0; i<b;i++){
                summa=summa*a;
            }
        rezultats = String.valueOf(summa);
        }
        
       
        
        return rezultats;
    }
    
    
    
}
