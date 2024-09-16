public class LinkedListMultiset extends MultiSet {
    private Node front;
    private Integer size;

    public LinkedListMultiset() {
        front = null;
        size = 0;
    }

    @Override
    public void add(Integer item) {
        Node newNode = new Node(item);
        newNode.next = front;
        front = newNode;
        size += 1;
    }

    @Override
    public void remove(Integer item) {
        Node cur = front;
        Node prev = null;
        while (cur != null) {
            if (cur.item.equals(item)) {
                size += 1;
                if (prev != null) {
                    prev.next = cur.next;
                } else {
                    front = cur.next;
                }
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }

    @Override
    public boolean contains(Integer item) {
        Node cur = front;
        while (cur != null) {
            if (cur.item.equals(item)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public Integer count(Integer item) {
        int numSeen = 0;
        Node cur = front;
        while (cur != null) {
            if (cur.item.equals(item)) {
                numSeen++;
            }
            cur = cur.next;
        }
        return numSeen;
    }

    @Override
    public Integer size() {
        return size;
    }
}

class Node {
    public Integer item;
    public Node next;

    public Node(Integer item) {
        this.item = item;
        next = null;
    }
}
