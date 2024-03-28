package lab3;

import java.util.HashSet;

public class MyHashSet {
    HashSet<Integer> hset = new HashSet<>();
    HashSet<Integer> hset2 = new HashSet<>();
    HashSet<Integer> hset3 = new HashSet<>();

    public MyHashSet() {
    }

    public void compare() {

        for (Integer elem : this.hset) {
            if (this.hset2.contains(elem)) {
                this.hset3.add(elem);
            }
        }

    }
}
