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
public class Daudzsturis {
    Scanner obj = new Scanner(System.in);
    private int maluSkaits; //private lai nevaretu mainigajam pieklut bez papildus metodem
    private double malasGarums;
    
    public void PrivateMalas()
    {
    System.out.println("Ievadi malu skaitu -  ");
    maluSkaits = obj.nextInt();
    
    System.out.println("Ievadi vienas malas garumu - ");
    malasGarums = obj.nextDouble();
        
    }
    
    //metode
    public double Perimetrs(){
    
    double perimetrs = maluSkaits * malasGarums; //local mainigais ka arpus tas nestrada
    return perimetrs;
    }
    
    public void Malas()
    {
        switch(maluSkaits) 
            {
                   
            case 3:
            System.out.println("Tas ir Tristuris");
            break;
            
            case 4:
            System.out.println("Cetsturis");
            break;
            
            case 5:
            System.out.println("Piecsturis");
            break;
            
            default: 
            System.out.println("Nenosaku sada veida daudzsturi");
            }
    }
}
