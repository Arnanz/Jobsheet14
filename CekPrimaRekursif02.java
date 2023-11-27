import java.util.Scanner;
public class CekPrimaRekursif02 {
    static boolean cekBilanganPrima(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return cekBilanganPrima(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();
        boolean isPrima = cekBilanganPrima(n, 2);
        if (isPrima) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}