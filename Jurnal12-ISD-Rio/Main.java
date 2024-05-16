import java.util.PriorityQueue; // Mengimpor kelas PriorityQueue dari paket java.util
import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util

// Mendefinisikan kelas Tugas yang mengimplementasikan interface Comparable
class Tugas implements Comparable<Tugas> {
    private int deadline; // Variabel instance untuk menyimpan deadline tugas
    private String nama; // Variabel instance untuk menyimpan nama tugas

    // Konstruktor untuk kelas Tugas
    public Tugas(int deadline, String nama) {
        this.deadline = deadline; // Menginisialisasi deadline tugas
        this.nama = nama; // Menginisialisasi nama tugas
    }

    // Metode untuk mendapatkan deadline tugas
    public int getDeadline() {
        return deadline;
    }

    // Metode untuk mendapatkan nama tugas
    public String getName() {
        return nama;
    }

    // Metode untuk membandingkan tugas berdasarkan deadline
    @Override
    public int compareTo(Tugas other) {
        return Integer.compare(this.deadline, other.deadline);
    }

    // Metode untuk mengubah tugas menjadi string
    @Override
    public String toString() {
        return nama + " (deadline: " + deadline + ")";
    }
}

public class Main {
    private PriorityQueue<Tugas> tasks;

    public Main() {
        tasks = new PriorityQueue<>();
    }

    public void addTask(int deadline, String nama) {
        tasks.offer(new Tugas(deadline, nama));
    }

    public void showNextTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas yang harus diselesaikan.");
        } else {
            System.out.println("Task terdekat yang harus diselesaikan: " + tasks.peek().getName());
        }
    }

    public void completeNextTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas yang harus diselesaikan.");
        } else {
            Tugas completedTask = tasks.poll();
            System.out.println(completedTask.getName() + " selesai dilaksanakan.");
            showNextTask();
        }
    }

    public void clearAllTasks() {
        tasks.clear();
        System.out.println("Semua tugas telah dihapus.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main toDoList = new Main();

        System.out.println("Masukkan tugas dengan format: deadline, nama tugas (ketik 'selesai' untuk mengakhiri input)");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("selesai")) {
                break;
            }
            String[] parts = input.split(",\\s*");
            if (parts.length == 2) {
                try {
                    int deadline = Integer.parseInt(parts[0].trim());
                    String nama = parts[1].trim();
                    toDoList.addTask(deadline, nama);
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid.");
                }
            } else {
                System.out.println("Input tidak valid.");
            }
        }

        toDoList.showNextTask();

        System.out.println("\nMasukkan perintah (selesai, hapus semua, lihat berikutnya, atau selesaikan tugas):");
        while (true) {
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("selesai")) {
                break;
            } else if (command.equalsIgnoreCase("hapus semua")) {
                toDoList.clearAllTasks();
            } else if (command.equalsIgnoreCase("lihat berikutnya")) {
                toDoList.showNextTask();
            } else if (command.equalsIgnoreCase("done")) {
                toDoList.completeNextTask();
            } else {
                System.out.println("Perintah tidak dikenal. Masukkan 'selesai', 'hapus semua', 'lihat berikutnya', atau 'selesaikan tugas'.");
            }
        }

        scanner.close();
    }
}

