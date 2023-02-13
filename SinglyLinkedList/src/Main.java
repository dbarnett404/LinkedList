public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("ant");
        linkedList.add("bee");
        linkedList.add("cat");
        linkedList.addAtHead("duck");

        System.out.println("Print from head");
        linkedList.print();
        System.out.println("Delete at tail");
        linkedList.deleteAtTail();
        linkedList.print();

        System.out.println("Delete at head");
        linkedList.deleteAtHead();
        linkedList.print();


        System.out.println("Print from tail");
        linkedList.printFromTail();
    }
}