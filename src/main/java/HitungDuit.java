import java.util.Scanner;

public class HitungDuit {

    public static void main(String[] args) {

        int nKoin = 0;
        int nLembar = 0;
        int jumlah;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan uang : ");
        jumlah = scanner.nextInt();

        if (jumlah >= 100_000) {
            int n = jumlah / 100_000;
            jumlah = jumlah % 100_000;
            nLembar += n;
            System.out.println("Rp. 100ribu: " + n + " lembar");
        }
        if (jumlah >= 50_000) {
            int n = jumlah / 50_000;
            jumlah = jumlah % 50_000;
            nLembar += n;
            System.out.println("Rp.  50ribu: " + n + " lembar");
        }
        if (jumlah >= 20_000) {
            int n = jumlah / 20_000;
            jumlah = jumlah % 20_000;
            nLembar += n;
            System.out.println("Rp.  20ribu: " + n + " lembar");
        }
        if (jumlah >= 10_000) {
            int n = jumlah / 10_000;
            jumlah = jumlah % 10_000;
            nLembar += n;
            System.out.println("Rp.  10ribu: " + n + " lembar");
        }
        if (jumlah >= 5_000) {
            int n = jumlah / 5_000;
            jumlah = jumlah % 5_000;
            nLembar += n;
            System.out.println("Rp.   5ribu: " + n + " lembar");
        }
        if (jumlah >= 2_000) {
            int n = jumlah / 2_000;
            jumlah = jumlah % 2_000;
            nLembar += n;
            System.out.println("Rp.   2000: " + n + " lembar");
        }
        if (jumlah >= 1_000) {
            int n = jumlah / 1_000;
            jumlah = jumlah % 1_000;
            nLembar += n;
            System.out.println("Rp.   1000: " + n + " lembar");
        }
        if (jumlah >= 500) {
            int n = jumlah / 500;
            jumlah = jumlah % 500;
            nKoin += n;
            System.out.println("Rp.    500: " + n + " lembar");
        }
        if (jumlah >= 200) {
            int n = jumlah / 200;
            jumlah = jumlah % 200;
            nKoin += n;
            System.out.println("Rp.    200: " + n + " lembar");
        }
        if (jumlah >= 100) {
            int n = jumlah / 100;
            nKoin += n;
            System.out.println("Rp.    100: " + n + " lembar");
        }
        System.out.println("Total uang lembar : " + nLembar);
        System.out.println("Total uang koin : " + nKoin);
    }
}