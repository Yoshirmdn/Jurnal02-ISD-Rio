import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> daftar = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1. Tambah Pekerjaan\n2. Tugas yg Pertama kali dikerjakan\n3. Hapus tugas yang sudah selesai\n4. menampilkan semua pekerjaan\n5. Keluar\nPilih :");
            int pilihan = s.nextInt();
            switch (pilihan) {
                case 1:
                    String tugas = s.next();
                    daftar.offer(tugas);
                    break;
                case 2:
                    System.out.println("\nanda harus mengerjakan " + daftar.peek() + " terlebih dahulu");
                    break;
                case 3:
                    daftar.poll();
                    break;
                case 4:
                    int i = 1;
                    for (String namatugas : daftar) {
                        System.out.println(i + ". " + namatugas);
                        i++;
                    }
                    break;
                case 5:
                    s.close(); // Closing the scanner when done
                    System.exit(0);
                    break;
                default:
                    System.out.println("salah input");
                    break;
            }
        }
    }
}
