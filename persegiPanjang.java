public class persegiPanjang { 
    public int panjang;
    public int lebar;
    
    public void cetakInfo() {
        System.out.println("Panjang: " + panjang + ", lebar: " + lebar);
     }
    //      public static void main(String[] args) {
    //         persegiPanjang[] arrayOfPersegiPanjang = new persegiPanjang[3];
    //         for (int i =0; i < arrayOfPersegiPanjang.length;i++){
    //             System.out.println("persegi panjang ke- " +(i+1)+", ");
    //             arrayOfPersegiPanjang[i].cetakInfo();
    //         }
    //      }
         public persegiPanjang(int p, int l) {
            panjang = p;
             lebar = l;
          }
          public int hitungluas(){
            return panjang * lebar;
          }
          public int hitungKeliling(){
            return 2*(panjang + lebar);
          }
        }
          
    

