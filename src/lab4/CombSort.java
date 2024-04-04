package lab4;

import java.util.ArrayList;

public class CombSort {
    int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        return Math.max(gap, 1);
    }
    void sort(ArrayList<Integer> arr) {
        int n = arr.size();

        int gap = n;


        boolean swapped = true;

        while (gap != 1 || swapped) {

            gap = getNextGap(gap);

            swapped = false;

            for (int i = 0; i < n - gap; i++) {
                if (arr.get(i) > arr.get(i + gap)) {

                    int temp = arr.get(i);
                    arr.set(i, arr.get(i + gap));
                    arr.set(i + gap, temp);


                    swapped = true;
                }
            }
        }
    }

}



