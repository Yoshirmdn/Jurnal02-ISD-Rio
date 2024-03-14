import java.util.*;

public class Tugas implements Comparable<Tugas> {
    private String matakuliah;
    private String tugas;
    private String deadline;

    public Tugas(String matakuliah, String tugas, String deadline) {
        this.matakuliah = matakuliah;
        this.tugas = tugas;
        this.deadline = deadline;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    @Override
    public String toString() {
        return "matakuliah = " + matakuliah + ", tugas = " + tugas + ", deadline = " + deadline;
    }

    @Override
    public int compareTo(Tugas tugas) {
        return this.getMatakuliah().compareTo(tugas.getMatakuliah());
    }
}
