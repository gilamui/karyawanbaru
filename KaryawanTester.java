public class KaryawanTester {
    public static void main(String[] args) {
        Karyawan Moreno = new Karyawan(24,"Moreno","TU","Bogor");
        Karyawan Nibras = new Karyawan(29, "Nibras", "Kesiswaan", "lamongan");
        Karyawan Burhan = new Karyawan(26, "Burhan", "Kurikulum", "Tulungagung");
        Karyawan Bintang = new Karyawan(25, "Bintang", "Kesiswaan", "Inggris");
        Karyawan Azam = new Karyawan(22, "Azam", "Kurikulum", "Malang");

        Moreno.print();
        System.out.println();
        Nibras.print();
        System.out.println();
        Burhan.print();
        System.out.println();
        Bintang.print();
        System.out.println();
        Azam.print();
    }
}