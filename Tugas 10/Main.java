import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pemain> timA = new ArrayList<>(Arrays.asList(
            new Pemain(168, 50), new Pemain(170, 60), new Pemain(165, 56), new Pemain(168, 55),
            new Pemain(172, 60), new Pemain(170, 70), new Pemain(169, 66), new Pemain(165, 56),
            new Pemain(171, 72), new Pemain(166, 56)
        ));

        ArrayList<Pemain> timB = new ArrayList<>(Arrays.asList(
            new Pemain(170, 66), new Pemain(167, 60), new Pemain(165, 59), new Pemain(166, 58),
            new Pemain(168, 58), new Pemain(175, 71), new Pemain(172, 68), new Pemain(171, 68),
            new Pemain(168, 65), new Pemain(169, 60)
        ));

        //Mengurutkan berdasarkan tinggi
        System.out.println("\n=== Urutan Tinggi Badan ===");
        TimFutsalUtils.sortTinggi(timA, true);
        System.out.println("Tim A Tinggi Asc: " + timA);
        TimFutsalUtils.sortTinggi(timA, false);
        System.out.println("Tim A Tinggi Desc: " + timA);

        TimFutsalUtils.sortTinggi(timB, true);
        System.out.println("Tim B Tinggi Asc: " + timB);
        TimFutsalUtils.sortTinggi(timB, false);
        System.out.println("Tim B Tinggi Desc: " + timB);

        //Mengurutkan berdasarkan berat
        System.out.println("\n=== Urutan Berat Badan ===");
        TimFutsalUtils.sortBerat(timA, true);
        System.out.println("Tim A Berat Asc: " + timA);
        TimFutsalUtils.sortBerat(timA, false);
        System.out.println("Tim A Berat Desc: " + timA);

        TimFutsalUtils.sortBerat(timB, true);
        System.out.println("Tim B Berat Asc: " + timB);
        TimFutsalUtils.sortBerat(timB, false);
        System.out.println("Tim B Berat Desc: " + timB);

        // Data untuk nilai Max/Min
        System.out.println("\n=== Data Max/Min ===");
        TimFutsalUtils.printMaxMin(timA, "Tim A");
        TimFutsalUtils.printMaxMin(timB, "Tim B");

        // Copy Tim B ke Tim C
        ArrayList<Pemain> timC = new ArrayList<>(timB);
        System.out.println("--- Tim C (Copy dari Tim B) ---");
        System.out.println(timC + "\n");

        //Menghitung jumlah pemain dengan tinggi tertentu di Tim B
        System.out.println("--- Jumlah Pemain Tim B ---");
        System.out.println("Tinggi 168 cm: " + TimFutsalUtils.countByTinggi(timB, 168) + " pemain");
        System.out.println("Tinggi 160 cm: " + TimFutsalUtils.countByTinggi(timB, 160) + " pemain\n");

        //Menghitung jumlah pemain dengan berat tertentu di Tim A
        System.out.println("--- Jumlah Pemain Tim A ---");
        System.out.println("Berat 56 kg: " + TimFutsalUtils.countByBerat(timA, 56) + " pemain");
        System.out.println("Berat 53 kg: " + TimFutsalUtils.countByBerat(timA, 53) + " pemain\n");

        //mengecek kesamaan
        TimFutsalUtils.cekKesamaan(timA, timB);
    }
}