import java.util.Scanner;
public class PenjumlahanRekursif02 {
    static String penjumlahanString(int n) {
        if (n == 1) {
            return "1";
        } else {
            return penjumlahanString(n - 1) + "+" + n;
        }
    }
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("f: ");
        int f = scanner.nextInt();
        String penjumlahan = penjumlahanString(f);
        int hasil = penjumlahanRekursif(f);
        System.out.println(penjumlahan + " = " + hasil);
    }
}