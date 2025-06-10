
public class Pemain {
    int tinggi;
    int berat;

    public Pemain(int tinggi, int berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "[Tinggi: " + tinggi + ", Berat: " + berat + "]";
    }
}
