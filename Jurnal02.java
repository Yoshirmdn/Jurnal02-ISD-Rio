import java.util.ArrayList;

public class Jurnal02 {
    class inventory<E>{
        private ArrayList<E> barang;
        public inventory() {
            barang = new ArrayList<E>();
        }
        public void addData(E values) {
            barang.add(values);
        }
        public void editData(int index, E values) {
            barang.set(index, values);
        }
        public void deleteData(int index) {
            barang.remove(index);
        }
        public ArrayList<E> displayData() {
            return barang;
        }
    }
    class ATK{
        private String kd_barang;
        private String jenis_barang;
        private String nama_barang;
        private int stok_barang;
        public ATK(String kd_barang, String jenis_barang, String nama_barang, int stok_barang) {
            this.kd_barang = kd_barang;
            this.jenis_barang = jenis_barang;
            this.nama_barang = nama_barang;
            this.stok_barang = stok_barang;
        }
        public String getkd_barang() {
            return kd_barang;
        }
        public String getjenis_barang() {
            return jenis_barang;
        }
        public String getnama_barang() {
            return nama_barang;
        }
        public int getstok_barang() {
            return stok_barang;
        }
        public void setkd_barang(String kd_barang) {
            this.kd_barang = kd_barang;
        }
        public void setjenis_barang(String jenis_barang) {
            this.jenis_barang = jenis_barang;
        }
        public void setnama_barang(String nama_barang) {
            this.nama_barang = nama_barang;
        }
        public void setstok_barang(int stok_barang) {
            this.stok_barang = stok_barang;
        }
        public String toString() {
            return "Kode Barang: " + kd_barang + ", Jenis Barang: " + jenis_barang + ", Nama Barang: " + nama_barang + ", Stok Barang: " + stok_barang;
        }
    }
    class BAG{
        private String kd_barang;
        private String jenis_barang;
        private String nama_barang;
        private int stok_barang;
        public BAG(String kd_barang, String jenis_barang, String nama_barang, int stok_barang) {
            this.kd_barang = kd_barang;
            this.jenis_barang = jenis_barang;
            this.nama_barang = nama_barang;
            this.stok_barang = stok_barang;
        }
        public String getkd_barang() {
            return kd_barang;
        }
        public String getjenis_barang() {
            return jenis_barang;
        }
        public String getnama_barang() {
            return nama_barang;
        }
        public int getstok_barang() {
            return stok_barang;
        }
        public void setkd_barang(String kd_barang) {
            this.kd_barang = kd_barang;
        }
        public void setjenis_barang(String jenis_barang) {
            this.jenis_barang = jenis_barang;
        }
        public void setnama_barang(String nama_barang) {
            this.nama_barang = nama_barang;
        }
        public void setstok_barang(int stok_barang) {
            this.stok_barang = stok_barang;
        }
        public String toString() {
            return "Kode Barang: " + kd_barang + ", Jenis Barang: " + jenis_barang + ", Nama Barang: " + nama_barang + ", Stok Barang: " + stok_barang;
        }
    }
    public static void main(String[] args) {
        inventory<ATK> atk = new Jurnal02().new inventory<ATK>();
        inventory<BAG> bag = new Jurnal02().new inventory<BAG>();
        atk.addData(new Jurnal02().new ATK("A001", "Pensil", "Pensil 2B", 100));
        atk.addData(new Jurnal02().new ATK("A002", "Pensil", "Pensil Faber Castel", 100));
        atk.addData(new Jurnal02().new ATK("A003", "Pulpen", "Pulpen Snowman", 100));
        atk.addData(new Jurnal02().new ATK("A004", "Penghapus", "Penghapus Joyko", 100));
        atk.addData(new Jurnal02().new ATK("A005", "Tip-X", "Tip-X Joyko", 100));

        bag.addData(new Jurnal02().new BAG("B001", "Tas", "Tas Ransel", 100));
        bag.addData(new Jurnal02().new BAG("B002", "Tas", "Tas Slempang", 100));
        bag.addData(new Jurnal02().new BAG("B003", "Tas", "Tas Jinjing", 100));
        bag.addData(new Jurnal02().new BAG("B004", "Tas", "Tas Selempang", 100));
        bag.addData(new Jurnal02().new BAG("B005", "Tas", "Tas Laptop", 100));  
        System.out.println("=====================================================================");
        for(ATK a : atk.displayData()) {
            System.out.println("Kode Barang: " + a.getkd_barang() + "\nJenis Barang: " + a.getjenis_barang() + "\nNama Barang: " + a.getnama_barang() + "\nStok Barang: " + a.getstok_barang());
        }
        System.out.println("=====================================================================");
        for(BAG b : bag.displayData()) {
            System.out.println("Kode Barang: " + b.getkd_barang() + "\nJenis Barang: " + b.getjenis_barang() + "\nNama Barang: " + b.getnama_barang() + "\nStok Barang: " + b.getstok_barang());
        }
        System.out.println("================================Delete=====================================");
        atk.deleteData(1);
        bag.deleteData(1);
        System.out.println("================================Edit=====================================");
        atk.editData(1, new Jurnal02().new ATK("A002", "Pensil", "Pensil Faber Castel", 200));
        bag.editData(1, new Jurnal02().new BAG("B002", "Tas", "Tas Slempang", 200));
    }

}
