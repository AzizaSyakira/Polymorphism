public class Simulator {
    public static void main(String[] args) {

        Asdos Fairuzikun = new Asdos("Fairuzikun", 20, 13);
        Dosen RajaOPDamanik = new Dosen("Raja OP Damanik", 5);
        Asdos AngelChan = new Asdos("Angel-chan", 20, 4);
        Mahasiswa Firman = new Mahasiswa("Firman", 20);
        Mahasiswa NidToPassThisSem = new Mahasiswa("Nid to pass this sem", 23);
        Dosen Nivotko = new Dosen("Nivotko", 3);

        System.out.println(Fairuzikun);
        System.out.println(RajaOPDamanik);
        System.out.println(AngelChan);
        System.out.println(Firman);
        System.out.println(NidToPassThisSem);
        System.out.println(Nivotko);

        int totalJamSibuk = Fairuzikun.getJamSibuk() + RajaOPDamanik.getJamSibuk() +
                            AngelChan.getJamSibuk() + Firman.getJamSibuk() +
                            NidToPassThisSem.getJamSibuk() + Nivotko.getJamSibuk();

        System.out.println("Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);
    }
}
