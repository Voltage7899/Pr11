package com.company;
import java.util.Arrays;

public class arrayQADT {
    private Object[] elements = new Object[1];

    public static void enqueue(arrayQADT array, Object element) {
        assert element != null;
        array.elements[array.elements.length-1] = element;
        ensureCapacity(array, array.elements.length);
    }

    private static void ensureCapacity(arrayQADT array, int capacity) {
        if (capacity >= array.elements.length) {
            array.elements = Arrays.copyOf(array.elements, capacity+1);
        }
    }

    public static Object dequeue(arrayQADT array) {
        if(array.elements.length > 0) {
            Object value = array.elements[0];
            Object[] temp = new Object[array.elements.length - 1];
            System.arraycopy(array.elements, 1, temp, 0, array.elements.length - 1);
            array.elements = temp;
            return value;
        }
        else {
            return null;
        }
    }

    public Object element(){
        return elements[0];
    }

    public void clear(){
        elements = new Object[1];
    }

    public static Object element(arrayQADT array) {
        if(array.elements.length > 0) {
            return array.elements[0];
        }
        else {
            return null;
        }
    }

    public static int size(arrayQADT array) {
        return array.elements.length-1;
    }

    public static boolean isEmpty(arrayQADT array) {
        return array.elements.length-1 <= 0;
    }
}
