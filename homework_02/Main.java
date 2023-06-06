package homework_02;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        System.out.println("Изначальный связный список:");
        list.printList(LinkedList.head);

        list.reverse();
        System.out.println("");
        System.out.println("Перевернутый связный список:");
        list.printList(LinkedList.head);
    }
}