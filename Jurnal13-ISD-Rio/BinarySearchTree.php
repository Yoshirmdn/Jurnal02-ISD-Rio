class TreeNode {
    char data;
    TreeNode left, right;

    // Konstruktor untuk membuat node baru
    public TreeNode(char item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    // Metode untuk menyisipkan node baru
    void insert(char data) {
        root = insertRec(root, data);
    }

    // Fungsi rekursif untuk menyisipkan key baru dalam BST
    TreeNode insertRec(TreeNode root, char data) {
        // Jika pohon kosong, kembalikan node baru
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // Jika tidak, lanjutkan penyisipan di subtree kiri atau kanan
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        // Kembalikan pointer node (tidak berubah)
        return root;
    }

    // Metode untuk mencari key tertentu dalam BST
    boolean search(char data) {
        return searchRec(root, data);
    }

    // Fungsi rekursif untuk mencari key dalam BST
    boolean searchRec(TreeNode root, char data) {
        // Kasus basis: root adalah null atau key ada di root
        if (root == null)
            return false;
        if (root.data == data)
            return true;

        // Key lebih besar dari key root
        if (root.data < data)
            return searchRec(root.right, data);

        // Key lebih kecil dari key root
        return searchRec(root.left, data);
    }

    // Metode utilitas untuk traversal inorder (opsional untuk visualisasi)
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Menyisipkan data yang diberikan
        char[] elements = {'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J'};
        for (char element : elements) {
            tree.insert(element);
        }

        // Menampilkan traversal inorder dari BST
        System.out.println("Traversal inorder dari BST:");
        tree.inorder();
        System.out.println();

        // Mencari karakter K dan A
        char[] searchElements = {'K', 'A'};
        for (char element : searchElements) {
            boolean found = tree.search(element);
            System.out.println("Elemen " + element + " " + (found ? "ditemukan" : "tidak ditemukan") + " dalam BST.");
        }
    }
}
