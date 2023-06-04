import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListSumExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        int sum = calculateSum(linkedList);
        System.out.println("Сумма всех элементов: " + sum);
    }

    public static int calculateSum(LinkedList<Integer> list) {
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            sum += element;
        }
        return sum;
    }
}
