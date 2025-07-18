package org.example.interfaces;

public class IntArrayList implements IntList{
    private int[] data;
    private int size;

    public IntArrayList() {
        data = new int[10];
        size = 0;
    }

    public void add(int number) {
        if (size == data.length) {
            int newLength = data.length + data.length / 2;
            int[] newData = new int[newLength];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = number;
        size++;
    }

        public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + id);
        }
        return data[id];
    }

    public int getInternalArrayLength() {
        return data.length;
    }
}
