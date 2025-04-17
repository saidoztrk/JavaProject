// GenericStack.java
public class GenericStack<T> {
    private static class Node<U> {
        private U data;
        private Node<U> next;

        Node(U data, Node<U> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> top;

    // Yığına yeni bir öğe ekler
    public void push(T item) {
        top = new Node<>(item, top);
    }

    // Yığının en üstündeki öğeyi çıkarır ve döner
    public T pop() throws Exception {
        if (top == null) throw new Exception("Yığın boş, pop işlemi yapılamaz.");
        T item = top.data;
        top = top.next;
        return item;
    }

    // Yığının en üstündeki öğeyi döner, ama yığından çıkarmaz
    public T peek() throws Exception {
        if (top == null) throw new Exception("Yığın boş, peek işlemi yapılamaz.");
        return top.data;
    }

    // Yığının boş olup olmadığını kontrol eder
    public boolean isEmpty() {
        return top == null;
    }
}
