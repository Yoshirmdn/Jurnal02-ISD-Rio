import java.util.Scanner;

/**
 * keseluruhan program diambil dari Java Program to Implement Binary Tre
 * https://www.sanfoundry.com/java-program-implement-binary-tree/
 * dengan sedikit perubahan
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of BT */
        BinaryTree2 bt = new BinaryTree2();
        /* Perform tree operations */
        System.out.println("Binary Tree Test\n");
        char ch;
        do {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    bt.insert(scan.nextLine());
                    break;
                case 2:
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : " + bt.search(
                            scan.nextLine()));
                    break;
                case 3:
                    System.out.println("Nodes = " + bt.countNodes());
                    break;
                case 4:
                    System.out.println("Empty status = " + bt.isEmpty());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /* Display tree */
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}