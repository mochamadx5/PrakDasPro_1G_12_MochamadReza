package semester2.pertemuan3;

public class DataDosen12 {
    public static void dataSemuaDosen(Dosen12[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen12 dosen : arrayOfDosen) {
            System.out.println("------------------------");
            System.out.println("Kode        : " + dosen.kode);
            System.out.println("Nama        : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelammin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia        : " + dosen.usia);
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelammin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n=== Jumlah Dosen Berdasarkan Jenis Kelamin ===");
        System.out.println("Laki-laki : " + pria);
        System.out.println("Perempuan : " + wanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;

        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelammin) {
                totalPria += dosen.usia;
                countPria++;
            } else {
                totalWanita += dosen.usia;
                countWanita++;
            }
        }
        System.out.println("\n=== Rata-rata Usia Dosen Berdasarkan Jenis Kelamin ===");
        System.out.println("Laki-laki : " + (countPria == 0 ? "Tidak ada" : (totalPria / countPria) + " tahun"));
        System.out.println("Perempuan : " + (countWanita == 0 ? "Tidak ada" : (totalWanita / countWanita) + " tahun"));
    }
    public static void infoDosenPalingTua(Dosen12[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen12 tertua = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Tua ===");
        System.out.println("Kode        : " + tertua.kode);
        System.out.println("Nama        : " + tertua.nama);
        System.out.println("Jenis Kelamin : " + (tertua.jenisKelammin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia        : " + tertua.usia);
    }
        
    public static void infoDosenPalingMuda(Dosen12[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen12 termuda = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("\n=== Dosen Paling Muda ===");
        System.out.println("Kode        : " + termuda.kode);
        System.out.println("Nama        : " + termuda.nama);
        System.out.println("Jenis Kelamin : " + (termuda.jenisKelammin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia        : " + termuda.usia);
    }
}
