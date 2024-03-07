import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        singleLinkList < buku > linkList = new singleLinkList < > ();
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("1. Tambah data dari depan ");
            System.out.println("2. Tambah data dari belakang ");
            System.out.println("3. Hapus data dari belakang ");
            System.out.println("4. Cetak");
            System.out.println("5. Done");

            int pilih = inp.nextInt();
            String judulBuku = inp.nextLine();

            switch (pilih) {
                case 1:

                    System.out.print("Masukkan Judul Buku ");
                    judulBuku = inp.nextLine();
                    System.out.print("Masukkan Penulis Buku ");
                    String penulisBuku = inp.nextLine();
                    System.out.print("Masukkan Tahun Terbit Buku ");
                    String terbitBuku = inp.nextLine();
                    linkList.insertAtFront(new buku(judulBuku, penulisBuku, terbitBuku));
                    break;

                case 2:
                    System.out.print("Masukkan Judul Buku ");
                    String judulBukuBLKG = inp.nextLine();
                    System.out.print("Masukkan Penulis Buku ");
                    String penulisBukuBlkg = inp.nextLine();
                    System.out.print("Masukkan Tahun Terbit Buku ");
                    String terbitBukuBlkg = inp.nextLine();
                    linkList.insertAtBack(new buku(judulBukuBLKG, penulisBukuBlkg, terbitBukuBlkg));
                    break;

                case 3:
                    linkList.removeFromBack();
                    break;

                case 4:
                    linkList.print();
                    break;

                case 5:
                    lanjut = false;
                    break;

                default:
                    System.out.println("yang bener klo milih angka !!!");
                    break;
            }
            inp.close();
        }
    }
}