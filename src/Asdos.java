public class Asdos extends Mahasiswa {
    private int jamNgasdos;

    public Asdos(String name, int sks, int jamNgasdos) {
        super(name, sks);
        this.jamNgasdos = jamNgasdos;
    }

    @Override
    public int getJamSibuk() {
        int jamSibukMahasiswa = super.getJamSibuk();
        return jamSibukMahasiswa + jamNgasdos;
    }

    @Override
    public String toString() {
        return super.toString() + " dengan jam sibuk " + getJamSibuk();
    }
}
