package lab4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[])
    {
        CombSort ob = new CombSort();
        List<Integer> elements = List.of(8, 4, 1, 56, 3, -44, 23, -6, 28, 0);
        ArrayList<Integer> ar = new ArrayList<>(elements);
        ob.sort(ar);

        System.out.println("sorted array");
        for (int i=0; i<ar.size(); ++i)
            System.out.print(ar.get(i) + " ");

    }
}
