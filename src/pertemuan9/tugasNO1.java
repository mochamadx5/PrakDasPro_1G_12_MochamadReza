package pertemuan9;

import java.util.Scanner;

public class tugasNO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print("5 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
