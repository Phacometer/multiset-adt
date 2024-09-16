import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMultiset extends MultiSet {
    private ArrayList<Integer> list;

    public ArrayListMultiset() {
        list = new ArrayList<>();
    }

    public void add(Integer item) {
        list.add(item);
    }

    public void remove(Integer item) {
        if (list.contains(item)) {
            list.remove(item);
        }
    }

    public boolean contains(Integer item) {
        return list.contains(item);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Integer count(Integer item) {
        return Collections.frequency(list, item);
    }

    public Integer size() {
        return list.size();
    }
}
