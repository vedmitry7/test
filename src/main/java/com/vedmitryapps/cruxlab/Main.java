package com.vedmitryapps.cruxlab;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ItemList<Integer> itemList = new ItemList<Integer>();

        itemList.add(new Random().nextInt());
        itemList.add(new Random().nextInt());
        itemList.add(new Random().nextInt());

        itemList.printList();

        itemList.reverse();
        itemList.printList();

        itemList.reverseWithRecursion();
        itemList.printList();

    }
}
