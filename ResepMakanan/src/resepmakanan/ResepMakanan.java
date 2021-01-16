/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resepmakanan;

import java.util.Scanner;

public class ResepMakanan {

    public static void main(String[] args) {
        // TODO code application logic here
        int pil;
        PasteIsiCoklat pas=new PasteIsiCoklat();
            Scanner input = new Scanner (System.in);
        System.out.println("=================================");
        System.out.println("Rsep Resep cara pembuatan makanan");
        
        pas.nama();
        System.out.println("=================================");
        System.out.println("menu :");
        System.out.println("1.martabak :");
        System.out.println("1.Pastel isi coklat :");
        System.out.println("silakan pilih :");
        pil = input.nextInt();
        Martabak in=new Martabak();
       switch(pil){
           case 1:
           in.tampilmartabak();
           break;
           case 2:
           pas.peralatan();
           pas.inputan();       
} 
       
      }

   
}
