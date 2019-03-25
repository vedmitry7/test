package com.vedmitryapps.cruxlab;

public class Item<E> {

    private E value;
    private Item<E> next;

    public Item(E value) {
        this.value = value;
    }

    public Item<E> getNext() {
        return next;
    }

    public void setNext(Item<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
