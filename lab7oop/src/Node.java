public class Node {
    private Electronics electronics;
    private Node next;
    private Node previous;

    public Node(Electronics electronics, Node next, Node previous) {
        this.electronics = electronics;
        this.next = next;
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Electronics getElectronics() {
        return electronics;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
}