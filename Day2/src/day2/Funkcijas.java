/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author katri
 */
class Funkcijas {
    //Scanner obj = new Scanner(System.in);
    
    public int Skaitlis1,Skaitlis2;
   // public String Darbibas;
   
    
            
    public void Parbaude()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ja velies veiks saskaitisanu raksti S, ja atņemšanu - A -  ");
        String darbiba = obj.nextLine(); 
        
        System.out.println("Ievadi pirmo skaitli - ");
        Skaitlis1 = obj.nextInt();
        
        System.out.println("Ievadi otro skaitli - "); 
        Skaitlis2 = obj.nextInt();
        
        if (!darbiba.equals("A") && !darbiba.equals("S"))
        {
        System.out.println("Tāda darbība nav iespējama! Sāc no sākuma ");
        
        }else if (darbiba.equals("S"))
        {
            int summa = Skaitlis1 + Skaitlis2;
            System.out.println("Summa ir "+ summa);
        
        }    
        else {
            int atnemsana = Skaitlis1 - Skaitlis2;
            System.out.println("Starpiba ir "+ atnemsana);
        }
        
    }
    /*
    private void saskaitisana(int a, int b)
    {
        int summa = a+ b;
        System.out.println("Summa ir "+ summa);
        
    }
    
    private void atnemsana(int a, int b)
    {
        int atnemsana = a - b;
        System.out.println("Starpiba ir "+ atnemsana);
    }*/
}
