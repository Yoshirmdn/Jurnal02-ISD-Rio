import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Tugas> daftartugas = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. masukkan tugas\n2. hapus tugas\n3. tampilkan semua tugas\n4. keluar");
            int pilihan = 0;
            try {
                pilihan = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Mata Kuliah: ");
                    String matakuliah = s.nextLine();
                    System.out.println("Masukkan Tugas: ");
                    String tugas = s.nextLine();
                    System.out.println("Masukkan Deadline: ");
                    String deadline = s.nextLine();
                    daftartugas.addFirst(new Tugas(matakuliah, tugas, deadline));
                    break;
                case 2:
                    System.out.println("1. Hapus tugas terakhir\n2. Hapus tugas sesuai mata kuliah\n3. hapus tugas pertama");
                    int pilihan2 = Integer.parseInt(s.nextLine());
                    if (pilihan2 == 1) {
                        daftartugas.removeLast();
                    } else if (pilihan2 == 2) {
                        System.out.println("Masukkan nama mata kuliah :");
                        String namalagu = s.nextLine();
                        ListIterator<Tugas> it1 = daftartugas.listIterator();
                        while (it1.hasNext()) {
                            if (it1.next().getMatakuliah().equals(namalagu)) {
                                it1.remove();
                                break;
                            }
                        }
                    } else if (pilihan2 == 3) {
                        daftartugas.removeFirst();
                    } else {
                        System.out.println("Input salah");
                    }
                    break;
                case 3:
                    System.out.println("\n1. Urut dari akhir\n2. Urut dari awak");
                    ListIterator<Tugas> it2 = daftartugas.listIterator();
                    int pilihan3 = Integer.parseInt(s.nextLine());
                    if (pilihan3 == 1) {
                        System.out.println("\nMenampilkan daftar tugas dari akhir :");
                        while (it2.hasNext()) {
                            System.out.println(it2.next());
                        }
                    } else {
                        System.out.println("\nMenampilkan daftar tugas dari awal :");
                        while (it2.hasPrevious()) {
                            System.out.println(it2.previous());
                        }
                    }
                    break;
                case 4:
                    s.close();
                    System.exit(0);
                default:
                    System.out.println("salah input");
                    break;
            }
        }
    }
}
