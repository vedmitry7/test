package com.vedmitryapps.cruxlab;

public class ItemList<E> {

    Item<E> topItem;

    private Item<E> getTopItem() {
        String.valueOf(topItem);
        return topItem;
    }

    public void printList() {
        if (!isEmpty()) {
            Item<E> node = getTopItem();
            while (node != null) {
                System.out.println((node.toString()));
                node = node.getNext();
            }
        }
    }

    private boolean isEmpty() {
        return topItem==null;
    }

    public void add(E e) {
        if (topItem == null) {
            topItem = new Item<E>(e);
        } else {
            Item<E> temp = topItem;
            while (temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(new Item<E>(e));
        }
    }

    public void reverse() {
        Item<E> current = topItem;
        Item<E> previous = null;
        Item<E> next;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        topItem = previous;
    }

    public void reverseWithRecursion() {
        swap(topItem, null);
    }

    private void swap(Item<E> current, Item<E> previous) {
        if (current != null) {
            Item<E> next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
            swap(current, previous);
        } else {
            topItem = previous;
        }
    }

}
