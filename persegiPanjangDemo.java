import java.util.Scanner;

public class persegiPanjangDemo {
    public static void main(String[] args) {
        Scanner iki = new Scanner(System.in);

        System.out.println("masukan jumlah persegi panjang: ");
        int jumlah = iki.nextInt();

        persegiPanjang[] arrayOfPersegiPanjang = new persegiPanjang[jumlah];
        int panjang, lebar;
        
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            // System.out.println("persegi panjang ke-" + (i+1));
            System.out.println("masukan panjang : ");
            panjang = iki.nextInt();
            System.out.println("masukan lebar: ");
            lebar = iki.nextInt();

           
           arrayOfPersegiPanjang[i] = new persegiPanjang(panjang, lebar);
       
        }

    
        for (int a = 0; a < arrayOfPersegiPanjang.length; a++) {
            System.out.print("Persegi panjang ke- " + (a + 1)); //+ ", panjang: " 
           System.out.print("luas :" + arrayOfPersegiPanjang[a].hitungluas());
            System.out.print("keliling :" + arrayOfPersegiPanjang[a].hitungKeliling());
}
}
}
  //     System.out.println("Persegi panjang ke-" + (i + 1));
        //     System.out.println("Masukan panjang: ");
        //     arrayOfPersegiPanjang[i].panjang = iki.nextInt();
        //     System.out.println("Masukan lebar: ");
        //     arrayOfPersegiPanjang[i].lebar = iki.nextInt();
        // }  
        // + arrayOfPersegiPanjang[a].panjang + ", lebar: " + arrayOfPersegiPanjang[a].lebar + ", luas: " +
            // arrayOfPersegiPanjang[a].hitungluas() + ", keliling: " +arrayOfPersegiPanjang[a].hitungKeliling());