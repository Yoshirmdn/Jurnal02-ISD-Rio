/* Class BTNode */
class BTNode2<E> {
    BTNode2 left, right;
    E data;

    /* Constructor */
    public BTNode2() {
        left = null;
        right = null;
        data = null;
    }

    /* Constructor */
    public BTNode2(E item) {
        left = null;
        right = null;
        data = item;
    }

    /* Function to set left node */
    public void setLeft(BTNode2 n) {
        left = n;
    }

    /* Function to set right node */
    public void setRight(BTNode2 n) {
        right = n;
    }

    /* Function to get left node */
    public BTNode2 getLeft() {
        return left;
    }

    /* Function to get right node */
    public BTNode2 getRight() {
        return right;
    }

    /* Function to set data to node */
    public void setData(E d) {
        data = d;
    }

    /* Function to get data from node */
    public E getData() {
        return data;
    }
}