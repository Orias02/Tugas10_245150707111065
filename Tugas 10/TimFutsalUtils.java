
import java.util.*;

public class TimFutsalUtils {
    //untuk sortir tinggi
    public static void sortTinggi(ArrayList<Pemain> tim, boolean ascending) {
        tim.sort((p1, p2) -> ascending ? p1.tinggi - p2.tinggi : p2.tinggi - p1.tinggi);
    }

    //untuk sortir berat
    public static void sortBerat(ArrayList<Pemain> tim, boolean ascending) {
        tim.sort((p1, p2) -> ascending ? p1.berat - p2.berat : p2.berat - p1.berat);
    }

    //mencari nilai max dan min dari tinggi dan berat
    public static void printMaxMin(ArrayList<Pemain> tim, String namaTim) {
        int maxTinggi = Integer.MIN_VALUE, minTinggi = Integer.MAX_VALUE;
        int maxBerat = Integer.MIN_VALUE, minBerat = Integer.MAX_VALUE;
        for (Pemain p : tim) {
            if (p.tinggi > maxTinggi) maxTinggi = p.tinggi;
            if (p.tinggi < minTinggi) minTinggi = p.tinggi;
            if (p.berat > maxBerat) maxBerat = p.berat;
            if (p.berat < minBerat) minBerat = p.berat;
        }
        System.out.println("--- " + namaTim + " ---");
        System.out.println("Tinggi Max: " + maxTinggi + " cm, Min: " + minTinggi + " cm");
        System.out.println("Berat Max: " + maxBerat + " kg, Min: " + minBerat + " kg\n");
    }

    //hitung tinggi
    public static int countByTinggi(ArrayList<Pemain> tim, int tinggi) {
        return (int) tim.stream().filter(p -> p.tinggi == tinggi).count();
    }

    //hitung berat
    public static int countByBerat(ArrayList<Pemain> tim, int berat) {
        return (int) tim.stream().filter(p -> p.berat == berat).count();
    }

    //mengecek kesamaan
    public static void cekKesamaan(ArrayList<Pemain> timA, ArrayList<Pemain> timB) {
        System.out.println("--- Pemain dengan Tinggi atau Berat Sama di Tim A & B ---");
        for (Pemain a : timA) {
            for (Pemain b : timB) {
                if (a.tinggi == b.tinggi || a.berat == b.berat) {
                    System.out.println("Tim A " + a + " == Tim B " + b);
                }
            }
        }
    }
}
