import java.util.Scanner;
public class Fibonacci02 {
    static int jumlahPasanganMarmut(int bulan) {
        if (bulan <= 1) {
            return bulan;
        } else {
            return jumlahPasanganMarmut(bulan - 1) + jumlahPasanganMarmut(bulan - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bulan ke: ");
        int bulan = scanner.nextInt();
        int jumlahPasangan = jumlahPasanganMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah " + jumlahPasangan);
    }
}