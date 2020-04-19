/*
   sorting array 2 dimensi
   metode: Selection
 */
public class SelectionSortArray2D {

    public static void main(String[] args) {

        int[][] a = {
                {15, 14, 13, 12, 11},
                {10, 9, 8, 7, 6},
                {5, 4, 3, 2, 1}
        };
        int temp;
        int x;
        int y;

        for (int i = 0; i < a.length; i++) {
            x = i;
            for (int j = 0; j < a[i].length; j++) {
                y = j;
                for (int k = 0; k < a.length; k++) {
                    for (int l = 0; l < a[k].length; l++) {
                        if (k*a[k].length+l < i*a[i].length+j) continue;
                        if (a[x][y] > a[k][l]) {
                            x = k;
                            y = l;
                        }
                    }
                }
                temp = a[i][j];
                a[i][j] = a[x][y];
                a[x][y] = temp;
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
