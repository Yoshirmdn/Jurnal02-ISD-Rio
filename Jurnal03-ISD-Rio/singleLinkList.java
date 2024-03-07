import java.util.NoSuchElementException;

public class singleLinkList < E > {
    private listNode < E > firstNode;
    private listNode < E > lastNode;
    private String name;

    public singleLinkList() {
        this("linked list");
    }

    public singleLinkList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(E insertItem) {
        listNode newNode = new listNode(insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new listNode < E > (insertItem);
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        listNode newNode = new listNode < E > (insertItem);
        if (isEmpty()) {
            firstNode = lastNode = new listNode < E > (insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " Kosong");
        }
        E removedItem = lastNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            listNode < E > current = firstNode;
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removedItem;
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("The %s is %n", name);
            return;
        }
        System.out.printf("The %s is %n", name);
        listNode < E > current = firstNode;
        while (current != null) {
            System.out.printf("%s", current.data);
            current = current.next;
        }
        System.out.println();
    }
}