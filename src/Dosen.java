public class Dosen extends Element {
    private int jumlahHariKerja;

    public Dosen(String name, int jumlahHariKerja) {
        super(name);
        this.jumlahHariKerja = jumlahHariKerja;
    }

    @Override
    public int getJamSibuk() {
        return jumlahHariKerja * 8;
    }

    @Override
    public String toString() {
        return super.toString() + " dengan jam sibuk " + getJamSibuk();
    }
}