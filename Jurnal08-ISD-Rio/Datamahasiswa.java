//Nama : Rio Ragil Ramdani
//NIM  : 607062330034
import java.util.*;
class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private double nilai;

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = 0.0; //nilai awalnya 0 yak
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}

public class Datamahasiswa {
    //method main
    public static void main(String[] args) {
        Map<String, Mahasiswa> dataMahasiswa = new HashMap<>();
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Masukkan Nilai Mahasiswa");
            System.out.println("4. Tampilkan Semua Nilai Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int menu = inp.nextInt();

            switch (menu) {
                case 1:
                    tambahMahasiswa(inp, dataMahasiswa);
                    break;
                case 2:
                    hapusMahasiswa(inp, dataMahasiswa);
                    break;
                case 3:
                    masukkanNilai(inp, dataMahasiswa);
                    break;
                case 4:
                    tampilkanNilai(dataMahasiswa);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    inp.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
    //method untuk menambahkan mahasiswa
    private static void tambahMahasiswa(Scanner inp, Map<String, Mahasiswa> dataMahasiswa) {
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = inp.next();
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = inp.next();
        System.out.print("Masukkan Kelas Mahasiswa: ");
        String kelas = inp.next();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, kelas);
        dataMahasiswa.put(nim, mahasiswa);
        System.out.println("Mahasiswa dengan NIM " + nim + " berhasil ditambahkan.");
    }
    //method untuk menghapus mahasiswa
    private static void hapusMahasiswa(Scanner inp, Map<String, Mahasiswa> dataMahasiswa) {
        System.out.print("Masukkan NIM Mahasiswa yang Ingin Dihapus: ");
        String nim = inp.next();

        Mahasiswa mahasiswa = dataMahasiswa.remove(nim);
        if (mahasiswa != null) {
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
    //method untuk memasukkan nilai mahasiswa
    private static void masukkanNilai(Scanner inp, Map<String, Mahasiswa> dataMahasiswa) {
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = inp.next();

        Mahasiswa mahasiswa = dataMahasiswa.get(nim);
        if (mahasiswa != null) {
            System.out.print("Masukkan Nilai Mahasiswa: ");
            double nilai = inp.nextDouble();
            mahasiswa.setNilai(nilai);
            System.out.println("Nilai mahasiswa dengan NIM " + nim + " berhasil dimasukkan.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }
    //method untuk menampilkan nilai mahasiswa dan rata ratanya
    private static void tampilkanNilai(Map<String, Mahasiswa> dataMahasiswa) {
        if (dataMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            double totalNilai = 0;
            int jumlahMahasiswa = 0;

            for (Mahasiswa mahasiswa : dataMahasiswa.values()) {
                System.out.println("NIM: " + mahasiswa.getNim());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("Kelas: " + mahasiswa.getKelas());
                System.out.println("Nilai: " + mahasiswa.getNilai());
                System.out.println();

                totalNilai += mahasiswa.getNilai();
                jumlahMahasiswa++;
            }

            double rataRata = totalNilai / jumlahMahasiswa;
            System.out.println("Rata-rata Nilai Mahasiswa: " + rataRata);
        }
    }
}
