public class LinkedList {
    private Node head , tail;
    private int count;

    /**
     * Constructor
     */
    public LinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Adds an item to the end of the list
     * @param data the item to add
     */
    public void add(Object data) {
        //Use a local variable Node to store the class object
        //containing data
        Node node = new Node(data);
        //If head is null list is empty
        if (head == null) {
            //Make head point to the item I just made
            head = node;
            tail = node;
        } else {
            //Make a local var and assign Head to it
            node.setPrevious(tail);
            tail.setNext(node);
            tail = node;
        }
        count++;
    }

    /**
     * Print the contents of the list
     */
    public void print() {
        if (head != null) {
            Node current = head;
            while (current.getNext() != null) {
                System.out.println(current);
                current = current.getNext();
            }
            System.out.println(current);
        } else {
            System.out.println("List is empty!");
        }
    }

    /**
     * Print the contents of the list tail first
     */
    public void printFromTail() {
        if (head != null) {
            Node current = tail;
            while (current.getPrevious() != null) {
                System.out.println(current);
                current = current.getPrevious();
            }
            System.out.println(current);
        } else {
            System.out.println("List is empty!");
        }
    }

    /**
     * Add a new node to the head of the list
     * @param data
     */
    public void addAtHead(Object data) {
        //Use a local variable Node to store the class object
        //containing data
        Node node = new Node(data);
        //If head is null list is empty
        if (head == null) {
            //Make head point to the item I just made
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
    }

    /**
     * Delete the node at the tail of the list
     */
    public void deleteAtTail() {
        if (head != null) {
            if (head != tail) {
                //Make a local var and assign Head to it
                Node current = tail.getPrevious();
                current.setNext(null);
                tail = current;
            } else {
                head = null;
                tail = null;
            }
            count--;
        } else {
            System.out.println("List is empty!");
        }
    }

    /**
     * Delete the node at the head of the list
     */
    public void deleteAtHead() {
        if (head != null) {
            if (head != tail) {
                head = head.getNext();
                head.setPrevious(null);
            } else {
                head = null;
                tail = null;
            }
            count--;
        } else {
            System.out.println("List is empty");
        }
    }
}
