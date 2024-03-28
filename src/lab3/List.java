package lab3;

import java.util.LinkedList;

public class List {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public List() {
    }

    public void add(int elem) {
        this.linkedList.add(elem);
        System.out.println("element added to list: " + elem);
    }

    public void display() {
        if (!this.linkedList.isEmpty()) {
            for(int i = 0; i < this.linkedList.size(); ++i) {
                System.out.println("index" + i + ":" + this.linkedList.get(i));
            }

        }
    }
}