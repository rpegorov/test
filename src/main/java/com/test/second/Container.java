package com.test.second;

public class Container {
    private Node head;
    private Node tail;

    public int getSize() {
        int count = 0;
        if (head != null) {
            count++;
            while (head.nextN != null) {
                count++;
                head = head.nextN;
            }
        } else {
            return 0;
        }
        return count;
    }

    public void printContainer() {
        Node n = head;
        while (n != null) {
            System.out.print(n.index + " ");
            n = n.nextN;
        }
        System.out.println();
    }

    public void addFirst(int element) {
        Node n = new Node();
        n.index = element;
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.nextN = head;
            head = n;
        }
    }

    public void addLast(int element) {
        Node n = new Node();
        n.index = element;
        if (tail == null) {
            head = n;
        } else {
            tail.nextN = n;
        }
        tail = n;
    }

    public void addMiddle(int element, int index) {
        Node n = head;
        Node n1 = new Node();
        n1.index = element;
        while (n.nextN != null) {
            if (n.index == index) {
                n1.nextN = n.nextN;
                n.nextN = n1;
                return;
            }
            n = n.nextN;
        }
    }

    public void setNodeIndex(int element, int index) {
        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }
        if (head.index == index) {
            head.index = element;
            return;
        }
        if (tail.index == index) {
            tail.index = element;
            return;
        }
        Node n = head.nextN;
        while (n != null) {
            if (n.index == index) {
                n.index = element;
                return;
            }
            n = n.nextN;
        }
    }

    public void removeFirstNode() {
        if (head == null) {
            System.out.println("Список пуст!");
        } else
            head = head.nextN;
    }

    public void removeNode(int index) {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.index == index) {
            head = head.nextN;
            return;
        }
        Node n = head;
        while (n.nextN != null) {
            if (n.nextN.index == index) {
                if (tail == n.nextN) {
                    tail = n;
                }
                n.nextN = n.nextN.nextN;
                return;
            }
            n = n.nextN;
        }
    }
}

