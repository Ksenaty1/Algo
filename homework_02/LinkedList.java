package homework_02;

public class LinkedList {
    static Node<Integer> head;

    void reverse() {
        Node<Integer> temp = null;
        Node<Integer> current = head;

        while (current != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.next;
        }

        if (temp != null) {
            head = temp.next;
        }
    }

    void push(Integer new_data) {

        Node<Integer> new_node = new Node<>();

        new_node.data = new_data;
        new_node.prev = head;

        if (head != null) {
            head.next = new_node;
        }

        head = new_node;
    }

    void printList(Node<Integer> node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.prev;
        }
    }
}
