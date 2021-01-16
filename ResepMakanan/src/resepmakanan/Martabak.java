
package resepmakanan;
public class  Martabak extends Snack implements Pembuat {
       String bahan1="- 350 gram tepung terigu.";
   String bahan2="- 2 sdm susu bubuk atau susu kental manis";
   String bahan3="susu";
   String bahan4="- 1/4 sdt garam";
   String bahan5="- 80-100 gram gula pasir/halus";
   String bahan6="- 1/4 sdt vanili";
   String bahan7="- 1 butir telur";
   String bahan8="- 1 kuning telur";
   String bahan9="- 30 gram margarin";
   String bahan10="- 1/4 sdt ragi bubuk";


      public void inputan(){
       System.out.println("bahan bahan :");
       System.out.println(bahan1);

       System.out.println(bahan2);

       System.out.println(bahan3);
  
       System.out.println(bahan4);
       System.out.println(bahan5);
       System.out.println(bahan6);
       System.out.println(bahan7);
       System.out.println(bahan8);
       System.out.println(bahan9);
       
       System.out.println(bahan10);
    
       System.out.println("=================================");
   
      }
      public void peralatan(){
         Pembuatan();
       System.out.println("cara buat :");
       System.out.println("1. Pertama masukan tepung, baking powder, gula, garam, vanili, dan susu bubuk ke dalam wadah.");
   
       System.out.println("2. Tambahkan air sedikit demi sedikit, sembari terus diaduk. Jangan terlalu banyak dan jangan terlalu sedikit");
      
       System.out.println("3. Tambahkan ragi, lalu diamkan selama 30 menit sampai satu jam");
     
       System.out.println("4. Setelah didiamkan, tambahkan telur sambil terus diaduk, tambahkan baking soda dan margarin leleh.");
       System.out.println("5. Setelah semua tercampur, panaskan loyang, jangan dioles mentega.");
       System.out.println("6. Masukkan adonan ke loyang, ketika adonan dimasukan jika berbunyi 'cesss' berarti panas nya sudah cukup dan segera kecilkan api agar tidak gosong bawahnya. ");
       System.out.println("7. Setelah matang angkat dan oles mentega/susu cair.");
       System.out.println("8. Letakkan topping sesuai selera. ");
      }
     public void tampilmartabak(){
          inputan();
          peralatan();
      }

    @Override
    public void Pembuatan() {
        System.out.println("Resep by ucup");
    }
}
