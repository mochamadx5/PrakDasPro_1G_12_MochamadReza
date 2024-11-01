package pertemuan9;

import java.util.Scanner;

public class tugasNO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang berpartisipasi: ");
        int jumlahPoliteknik = Integer.parseInt(scanner.nextLine());

        int politeknikCounter = 0;
        while (politeknikCounter < jumlahPoliteknik) {
            System.out.print("Masukkan nama Politeknik: ");
            String namaPoliteknik = scanner.nextLine();

            int caborCounter = 0;
            while (caborCounter < 4) {
                String cabor = "";
                if (caborCounter == 0) {
                    cabor = "Badminton";
                } else if (caborCounter == 1) {
                    cabor = "Tenis Meja";
                } else if (caborCounter == 2) {
                    cabor = "Basket";
                } else if (caborCounter == 3) {
                    cabor = "Bola Voli";
                }

                System.out.println("Masukkan 5 nama atlet untuk cabang " + cabor + " dari " + namaPoliteknik + ":");
                int atletCounter = 0;
                while (atletCounter < 5) {
                    System.out.print("Nama atlet " + (atletCounter + 1) + ": ");
                    String namaAtlet = scanner.nextLine();
                    System.out.println("Data disimpan: " + namaPoliteknik + " - " + cabor + " - " + namaAtlet);
                    atletCounter++;
                }

                caborCounter++;
            }

            politeknikCounter++;
        }

        scanner.close();
    }
}
