public class DeretDescendingRekursif02 {
    // Fungsi rekursif
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }
    // Fungsi iteratif
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Deret Descending dengan Rekursif:");
        deretDescendingRekursif(n);
        System.out.println("\n\nDeret Descending dengan Iteratif:");
        deretDescendingIteratif(n);
    }
}