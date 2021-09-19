package Lesson2;

import java.util.Iterator;
import java.util.List;

public class ReverseIterator<T> implements Iterator<T> {

    private final List<T> list;
    private  int position;

    public ReverseIterator(List<T> list) {
        this.list = list;
        this.position = list.size()-1;
    }


    @Override
    public boolean hasNext() {
        return position>=0;
    }

    @Override
    public T next() {
        return list.get(position--);
    }
}
