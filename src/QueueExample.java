import java.util.LinkedList;

public class QueueExample {
    private LinkedList<Object> queue = new LinkedList<>();

    public void enqueue(Object element) {
        queue.addLast(element);
    }

    public Object dequeue() {
        return queue.pollFirst();
    }

    public Object first() {
        return queue.peekFirst();
    }

    public static void main(String[] args) {
        QueueExample queueExample = new QueueExample();

        // Добавляем элементы в очередь
        queueExample.enqueue("Элемент 1");
        queueExample.enqueue("Элемент 2");
        queueExample.enqueue("Элемент 3");

        // Выводим первый элемент очереди
        System.out.println("Первый элемент: " + queueExample.first());

        // Удаляем и выводим элементы из очереди
        while (!queueExample.queue.isEmpty()) {
            System.out.println("Извлечен элемент: " + queueExample.dequeue());
        }
    }
}
