package pertemuan13;

public class kafe12 {
    public static void Menu (String namaPelanggan, String kodePromo, boolean isMember) {
        System.out.println("Selamat datang, "  + namaPelanggan + "!");

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50% untuk pembelian.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30% untuk pembelian.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh tarik - Rp 12,000");
        System.out.println("5. Roti bakar - Rp 10,000");
        System.out.println("6. mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silakan pilin menu yang anda inginkan");
    }   
    public static void main (String[] args){
        Menu("Andi", "DISKON10", true);
        System.out.println();
    }
}
