package linkedlist;


class LinkedList {

    static Node head;

    public Node reverseLinkedList(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
        return head;
    }

    public void show(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(12);
        linkedList.head.next = new Node(18);
        linkedList.head.next.next = new Node(1);
        linkedList.head.next.next.next = new Node(10);
        System.out.println("Linked List before reversing");
        linkedList.show(head);

        head = linkedList.reverseLinkedList(head);
        System.out.println("Linked List after reversing");
        linkedList.show(head);



    }
}
