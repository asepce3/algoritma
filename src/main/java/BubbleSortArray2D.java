/*
   Sorting array 2 dimensi
   metode : Bubble sort
 */
public class BubbleSortArray2D {

    public static void main(String[] args) {

        int[][] a = {
                {15, 14, 13, 12, 11},
                {10, 9, 8, 7, 6},
                {5, 4, 3, 2, 1}
        };
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    for (int l = 0; l < a[k].length; l++) {
                        if (a[i][j] < a[k][l]) {
                            temp = a[i][j];
                            a[i][j] = a[k][l];
                            a[k][l] = temp;
                        }
                    }
                }
            }
        }

        for (int[] ai : a) {
            for (int aii : ai) {
                System.out.printf("%3d", aii);
            }
            System.out.println();
        }
    }
}

