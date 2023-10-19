package ru.geekbrains.JDK_S03_HW;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
 * чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 */

public class MyCollection<T> implements Iterable{
    private Object[] arrays;
    private int lastIndex;
    private int length;

    public MyCollection() {
        this(3);
    }

    public MyCollection(int length){
        arrays = new Object[length];
        this.length = length;
        lastIndex = 0;
    }


    public void add(T t) {
        if (lastIndex >= length - 1) {
            resize();
        }
        arrays[lastIndex++] = t;
    }

    public void delete(int index) {
        arrays[index] = null;
        arrays = Arrays.stream(arrays).toList().toArray();
    }

    private void resize() {
        length += length;
        Object[] arr = new Object[length];
        System.arraycopy(arrays,0,arr,0,lastIndex);
        arrays = arr;
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "arrays=" + Arrays.toString(arrays) +
                '}';
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < lastIndex;
            }

            @Override
            public Object next() {
                return arrays[index++];
            }
        };
    }
}