package DataMahasiswa;

import java.util.Scanner;

public class mainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Jml MK: ");
        int jmlMK = sc.nextInt();

        DataMahasiswa mhs = new DataMahasiswa(nama, nim, jmlMK);
        mhs.inputNilai(sc);
        mhs.tampilRapor();
    }
}