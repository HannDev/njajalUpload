public class NjajalMain {
    public static void main(String[] args) {

        Njajal objek = new Njajal();
        int tahunnya = objek.tahun;
        String merknya = objek.merk;
        System.out.println("tahun mobil "+tahunnya);
        System.out.println("merk mobil "+merknya);

        int hitungJarak = objek.jarakTempuhMobil();
        System.out.println("jarak tempuhnya adalah "+hitungJarak+"km/jam");

        int jarak2 = objek.jarakTempuh();
        System.out.println("jarak2 adalah "+jarak2+"cm");

    }
}
