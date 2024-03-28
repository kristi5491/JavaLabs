package lab3;

public class Array {
    int[][] elements = new int[][]{{5, 4}, {6, 7}};

    public Array() {
    }

    public void changeElement(int elem, int row, int column) {
        if (elem == this.elements[row][column]) {
            System.out.println("Ця цифра вже записана ,виберіь іншу");
        } else {
            this.elements[row][column] = elem;
            System.out.println("Ви змінили елемент");
        }

    }

    public void display_array() {
        for (int i = 0; i < this.elements.length; ++i) {
            for (int j = 0; j < this.elements.length; ++j) {
                System.out.print(this.elements[i][j] + " ");
            }

            System.out.println();
        }
    }
}