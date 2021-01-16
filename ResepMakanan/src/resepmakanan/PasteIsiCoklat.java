
package resepmakanan;

public class PasteIsiCoklat extends Snack implements Pembuat{
          String bahan1="- 250 gram tepung terigu";
   String bahan2="- 1 sdm gula pasir";
   String bahan3="- 2 sdm margarin";
   String bahan4="- 1/4 sdt garam halus";
   String bahan5="- meses cokelat secukupnya";

public void nama(){
    namakelompok();
}
      public void inputan(){
       System.out.println("bahan bahan :");
       System.out.println(bahan1);

       System.out.println(bahan2);

       System.out.println(bahan3);
  
       System.out.println(bahan4);
       System.out.println(bahan5);

       System.out.println("=================================");
    
      }
      public void peralatan(){
          Pembuatan();
       System.out.println("cara buat :");
       System.out.println("1. Masukkan tepung terigu, margarin, gula pasir, garam halus, tuang air. Uleni perlahan hingga setengah kalis.");
   
       System.out.println("2. Ambil secukupnya adonan, gilas menggunakan botol kaca hingga tipis. Cetak menggunakan mulut gelas. Gilas lagi.");
      
       System.out.println("3. Beri 1 sdt meses, rekatkan bagian pinggirnya kemudian pilin.");
     
       System.out.println("4. Goreng pastel dengan api kecil hingga kering dan kecokelatan.");

      }

    @Override
    public void Pembuatan() {
        System.out.println("Resep by Ucup");
    }

    
}



