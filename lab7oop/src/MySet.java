import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Electronics> {
    private static final int INITIAL_CAPACITY = 15;
    private Electronics[] elements = new Electronics[INITIAL_CAPACITY];
    private int size = 0;

    public MySet() {
    }
    public MySet(Electronics electronics) {
        add(electronics);
    }
    public MySet(Collection<Electronics> collection) {
        addAll(collection);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o){
        Iterator<Electronics> iterator = iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(o.toString())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Electronics> iterator() {
        return new Iterator<Electronics>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Electronics next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public boolean add(Electronics electronics) {
        if(!contains(electronics)) {
            if (size > 14) {
                Electronics[] expandarr = this.elements;
                this.elements = new Electronics[(int) (INITIAL_CAPACITY * 1.3)];
                this.size = 0;
                addAll(Arrays.asList(expandarr));
            }
            elements[size] = electronics;
            size++;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Electronics> c) {
        for (Electronics electronics : c) {
            add(electronics);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = 0;
        boolean finded = false;
        for (Electronics element : elements) {
            if(element.equals(o.toString())){
                finded = true;
                break;
            }
            index++;

        }
        if(finded) {
            for (int i = index; i < size - 2; i++) {
                this.elements[i] = elements[i + 1];
            }
            this.size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean removedAny = false;
        for (Object o : c) {
            if(remove(o)){
                removedAny = true;
            }
        }
        if(removedAny){
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)){
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        this.elements = new Electronics[INITIAL_CAPACITY];
        this.size = 0;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

}