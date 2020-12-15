package com.company;


public class Fillandout {
    public static void fillForAQT() {
        for (int i = 0; i < 10; i++) {
            arrayQ.enqueue(i);
        }
    }

    public static void dumpForAQT() {
        while (!arrayQ.isEmpty()) {
            System.out.println(
                    arrayQ.size() + " " +
                            arrayQ.element() + " " +
                            arrayQ.dequeue()
            );
        }
    }

    public static void fill(ArrayMod array) {
        for (int i = 0; i < 10; i++) {
            array.enqueue(i);
        }
    }

    public static void dump(ArrayMod array) {
        while (array.isEmpty()) {
            System.out.println(array.size() + " " + " " + array.dequeue());
        }
    }
    public static void fill(arrayQADT stack) {
        for (int i = 0; i < 10; i++) {
            arrayQADT.enqueue(stack, i);
        }
    }

    public static void dump(arrayQADT stack) {
        while (!arrayQADT.isEmpty(stack)) {
            System.out.println(
                    arrayQADT.size(stack) + " " +
                            arrayQADT.element(stack) + " " +
                            arrayQADT.dequeue(stack)
            );
        }
    }






}