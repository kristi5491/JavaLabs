package lab3;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List elem = new List();
        elem.add(3);
        elem.add(4);
        elem.add(7);
        elem.add(8);
        elem.display();
        Array elem2 = new Array();
        elem2.changeElement(6, 1, 0);
        elem2.display_array();

        MyHashSet h = new MyHashSet();
        h.hset.add(5);
        h.hset.add(6);
        h.hset2.add(3);
        h.hset2.add(5);
        h.compare();

        System.out.println(h.hset3);
        MyHashMap hashSet = new MyHashMap();
        hashSet.add("key", 2);
        hashSet.add("candy", 1);
        hashSet.printElem();
    }
}
