package lesson8;

import java.util.Arrays;

public class Array {
    private int size;
    private int[] data;

    public Array(int size) {
        this.size = size;
        data = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Array{" +
                "size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
