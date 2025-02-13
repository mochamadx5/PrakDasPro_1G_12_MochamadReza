package UASPrakDaspro;

import java.util.Scanner;

public class UAS1G12 {
    public static void menuUtama() {
        System.out.println("===== MENU UTAMA =====");            
        System.out.println("1. Input data skor tim");
        System.out.println("2. Tampilkan Tabel skor");
        System.out.println("3. Tentukan juara");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4) : ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
        menuUtama();
        int pilihMenuUtama = sc.nextInt();
        System.out.println();
        sc.nextLine();
        
        if (pilihMenuUtama==1) {
        System.out.println("Masukkan nama tim ke 1 : kelinci ");
        // String kelinci = sc.nextLine();
        System.out.print("masukkan skor   kelinci  untuk level 1 :"   );
        int skor = sc.nextInt();
        System.out.print("masukkan skor  kelinci  untuk level 2 : " );
        int skor2 = sc.nextInt();

        System.out.println("Masukkan nama tim ke 2 : babi ");
        System.out.print("masukkan skor babi untuk level 1 :"   );
        int skor3 = sc.nextInt();
        System.out.print("masukkan skor babi untuk level 2 : " );
        int skor4 = sc.nextInt();

        System.out.println("Masukkan nama tim ke 3 : ular ");
        System.out.print("masukkan skor   ular   untuk level 1 :"   );
        int skor5 = sc.nextInt();
        System.out.print("masukkan skor  ular  untuk level 2 : " );
        int skor6 = sc.nextInt();

        System.out.println("Masukkan nama tim ke 4 : landak ");
        System.out.print("masukkan skor  landak  untuk level 1 : " );
        int skor7 = sc.nextInt();
        System.out.print("masukkan skor  landak  untuk level 2 : " );
        int skor8 = sc.nextInt();

        sc.nextLine();
    }
}
}
}

