import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        LinkedList<Integer> reversedList = reverseLinkedList(linkedList);
        System.out.println("Перевернутый список: " + reversedList);
    }

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversed = new LinkedList<>();
        for (T element : list) {
            reversed.addFirst(element);
        }
        return reversed;
    }
}
