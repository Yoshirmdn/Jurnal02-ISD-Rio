public class listNode < E > {
    E data;
    listNode < E > next;

    public listNode(E object) {
        data = object;
        this.next = null;
    }

    public E getData() {
        return data;
    }
}