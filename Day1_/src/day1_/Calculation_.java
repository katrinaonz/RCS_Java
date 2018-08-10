/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_;

/**
 *
 * @author katri
 */
class Calculation_ {
     public void Izvade(Double a, Double b)
    {
     /*   
    System.out.println(a);
    return "aaa";
    */
    double summa = a + b;
    double starpiba = a - b;
    System.out.println("Summa ir "+ summa);
    System.out.println("Starpiba ir "+ starpiba);
    
       // System.out.println(""); =---- short versija ir sout + tab
                
    }
     public double SummaD(Double a, double b)
     {
        return a + b; //vareja uzreiz ar rakstit a+b un atgrieztu summa
     }
     public double StarpibaD(Double a, double b)
     {
        return a - b;
     }
}
