/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1_;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author katri
 */
public class Day1_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculation_ calc = new Calculation_();
         Scanner sc = new Scanner(System.in);
         System.out.println("Ievadi pirmo skaitli - ");
         Double a = sc.nextDouble();
         System.out.println("Ievadi otro skaitli - ");
        Double b = sc.nextDouble();
        calc.Izvade(a, b);
        
        
        /* ja klase ir nosaukta "public static void" tad mes nelietoajm objektu calc bet
        pa taisno varam rakstit klases nosaukumu un izsaukt Calculation.Vii();
        */
        double summa = calc.SummaD(a, b);
        double starpiba = calc.StarpibaD(a, b);
        System.out.println("Skaitlu summa ir "+ summa + " un skaitlu starpiba ir "+ starpiba);
        
        //calc.Izvade("vii"); ja ir ir void klase
        //String input = calc.Izvade("aaaa");
        
        
        // TODO code application logic here
        /* piemers ko uzrakstijam 
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        //gaida kad ievadis tekstu ar zemak esosu linuju
        //un tad atkal to prada
        String ievade = sc.nextLine();
        System.out.println(ievade);*/
        
        //sitas vienmer bus
       /* ----- Scanner sc = new Scanner(System.in);
        //String ievade = sc.nextLine();
        System.out.println("Ievadi savu vārdu - ");
        String ievade = sc.nextLine();
        System.out.println("Sveiki "+ievade + "!!!");
        
        System.out.println("Ievadi savu gadskaitli - ");
        //ievade=String.valueOf(a) - convertacija no integer uz string
        //a=Integer.valueOf(ievade); - n string uz integer
        
        String a = sc.nextLine();
       /* int a,b;
        a = sc.nextInt(); nolasa mainigo
        
        ievade = String.valueOf(a-b);
        System.out.println(ievade);
        
        int gadskaitlis = Integer.valueOf(a);
        //nextline ir string ir prieks int nextInt()
        //int year = Calendar.getInstance().get(Calendar.YEAR); -->uzreiz panem pasreizejo gadu ko var lietot aprekiniem
        
        System.out.println("Ievadi pasreizejo gadu -");
        String b = sc.nextLine();
        int tagad = Integer.valueOf(b);
        int vecums = tagad - gadskaitlis; 
        System.out.println("Tavs vecums ir " + vecums + " gadi!!!" );
        
        */
    }
    
}
