public class Node {
    //Stores the actual data
    private Object data;
    //Points to the next node in the list
    private Node next, previous;
    //Constructor
    public Node(Object data) {
        this.data = data;
        next = null;
        previous = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "" + data;
    }
}
