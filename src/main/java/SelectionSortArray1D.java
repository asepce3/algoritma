/*
   sorting array 1 dimensi
   metode: Selection
 */
public class SelectionSortArray1D {

    public static void main(String[] args) {

        int[] a = {7, 6, 5, 4, 3, 2, 1};
        int temp;
        int x;
        int y;

        for (int i = 0; i < a.length-1; i++) {
            x = i;
            for (int j = i; j < a.length; j++) {
                if (a[x] > a[j]) {
                    x = j;
                }
            }
            temp = a[x];
            a[x] = a[i];
            a[i] = temp;
        }

        for (int ai : a) {
            System.out.printf("%3d", ai);
        }
    }
}
