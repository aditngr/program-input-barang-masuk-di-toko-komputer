package belajar;
import java.util.Scanner;
public class nilaiTambahan {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Banyaknya Jenis Barang yang Masuk : ");
        int total = read.nextInt();
        String barang[][] = new String[total][4];
            for (int i = 0; i < total; i++) {
                System.out.println("Data Barang ke " + (i + 1));
                for (int j = 0; j < 4; j++) {
                    if (j == 0) {
                        System.out.print("Nama : ");
                    } else if (j == 1) {
                        System.out.print("Merek : ");
                    } else if (j == 2) {
                        System.out.print("Tipe : ");
                    } else {
                        System.out.print("Jumlah : ");
                    }
                    barang[i][j] = read.next();
                }
            }
            System.out.println();
            System.out.println("Data Barang yang Masuk");
            System.out.println("-----------------------------");
            System.out.println("Nama \t\t Merek \t\t Tipe \t\t Jumlah \t\t");
            for (int i = 0; i < total; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(barang[i][j] + "\t\t");
                }
                System.out.println();
            }
    }
}
