/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasduajava;

/**
 *
 * @author asus
 */
public class TugasDua {
    public static void main(String[] args) {
        System.out.println("Perbedaan antara pemakaian == dengan equals");
        System.out.println(" ");
        
        String st1 = "Saya suka makan bakso";
        String st2 = "Saya suka makan bakso";
        String st3 = "Saya ";
        String st4 = "makan ";
        String st5 = "bakso";
        String st6 = st3+st4+st5;
        
        System.out.println(" ");
        System.out.println("Pernyataan 1 adalah : " +st1);
        System.out.println("Pernyataan 2 adalah : " +st2);
        System.out.println("Pernyataan 3 adalah : " +st3);
        System.out.println("Pernyataan 4 adalah : " +st4);
        System.out.println("Pernyataan 5 adalah : " +st5);
        System.out.println("Pernyataan 6 adalah : " +st6);
        System.out.println(" ");
        
        System.out.println("Pernyataan 1 == pernyataan 2 " + (st1==st2));
        System.out.println("Pernyataan 6 == pernyataan 1 " + (st6==st1));
        System.out.println("Pernyataan 6 == pernyataan 2 " + (st6==st2));
        System.out.println("Pernyataan 1 equals pernyataan 2 " + (st1.equals(st2)));
        System.out.println("Pernyataan 6 equals pernyataan 1 " + (st6.equals(st1)));
        System.out.println("Pernyataan 6 equals pernyataan 2 " + (st6.equals(st2)));
        
    }
}
