package com.test.second;

/**
 * Написать односвязанный список
 */
public class SecondTask {
    public static void main(String[] args) {
        Container c = new Container();
        c.addFirst(1);
        c.addLast(2);
        c.addFirst(5);
        c.addLast(7);
        c.addMiddle(8, 2);
        c.printContainer();
        c.setNodeIndex(77, 2);
        c.printContainer();
        c.addFirst(55);
        System.out.println(c.getSize());
    }
}
