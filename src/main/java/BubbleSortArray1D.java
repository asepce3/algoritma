/*
   Sorting array 1 dimensi
   metode: Bubble sort
 */
public class BubbleSortArray1D {

    public static void main(String[] args) {

        int[] a = {7, 6, 5, 4, 3, 2, 1};
        int temp;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i : a) {
            System.out.printf("%3d", i);
        }
    }
}
