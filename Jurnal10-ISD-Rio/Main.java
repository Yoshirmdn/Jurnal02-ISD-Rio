import java.util.*; // Mengimpor semua kelas dari paket java.util

class Graph { // Mendefinisikan kelas Graph
    private final int V; // Mendefinisikan jumlah simpul dalam graf
    private final List<List<Character>> adj; // Mendefinisikan daftar yang berisi daftar karakter sebagai representasi graf

    Graph(int V) { // Konstruktor Graph
        this.V = V; // Menginisialisasi jumlah simpul
        adj = new ArrayList<>(V); // Menginisialisasi daftar dengan ukuran V

        for (int i = 0; i < V; i++) // Loop untuk setiap simpul
            adj.add(new LinkedList<>()); // Menambahkan daftar baru untuk setiap simpul
    }

    void addEdge(char u, char v) { // Metode untuk menambahkan tepi antara u dan v
        adj.get(u - 'A').add(v); // Menambahkan v ke daftar u
    }

    void BFS(char start) { // Metode untuk traversal BFS
        boolean[] visited = new boolean[V]; // Array untuk melacak simpul yang telah dikunjungi
        Queue<Character> queue = new LinkedList<>(); // Queue untuk BFS

        visited[start - 'A'] = true; // Menandai simpul start sebagai dikunjungi
        queue.add(start); // Menambahkan simpul start ke queue

        while (!queue.isEmpty()) { // Loop selama queue tidak kosong
            char u = queue.poll(); // Menghapus dan mengembalikan elemen dari queue
            System.out.print(u + " "); // Mencetak simpul

            for (char v : adj.get(u - 'A')) { // Loop untuk setiap simpul yang berdekatan dengan u
                if (!visited[v - 'A']) { // Jika simpul belum dikunjungi
                    queue.add(v); // Menambahkan simpul ke queue
                    visited[v - 'A'] = true; // Menandai simpul sebagai dikunjungi
                }
            }
        }
    }

    void DFS(char start) { // Metode untuk traversal DFS
        boolean[] visited = new boolean[V]; // Array untuk melacak simpul yang telah dikunjungi
        DFSUtil(start, visited); // Memanggil metode DFSUtil
    }

    private void DFSUtil(char v, boolean[] visited) { // Metode utilitas untuk DFS
        visited[v - 'A'] = true; // Menandai simpul sebagai dikunjungi
        System.out.print(v + " "); // Mencetak simpul

        for (char u : adj.get(v - 'A')) { // Loop untuk setiap simpul yang berdekatan dengan v
            if (!visited[u - 'A']) // Jika simpul belum dikunjungi
                DFSUtil(u, visited); // Memanggil DFSUtil untuk simpul tersebut
        }
    }
}

public class Main { // Mendefinisikan kelas Main
    public static void main(String[] args) { // Metode main
        Graph graph = new Graph(9); // Membuat objek Graph dengan 9 simpul
        // Menambahkan tepi ke graf
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'D');
        graph.addEdge('A', 'E');
        graph.addEdge('B', 'E');
        graph.addEdge('D', 'G');
        graph.addEdge('E', 'H');
        graph.addEdge('E', 'F');
        graph.addEdge('G', 'H');
        graph.addEdge('H', 'I');
        graph.addEdge('I', 'F');
        graph.addEdge('F', 'C');

        System.out.println("BFS Traversal starting from A:"); // Mencetak pesan
        graph.BFS('A'); // Melakukan traversal BFS dari A

        System.out.println("\nDFS Traversal starting from A:"); // Mencetak pesan
        graph.DFS('A'); // Melakukan traversal DFS dari A
    }
}