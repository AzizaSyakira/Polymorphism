public class Mahasiswa extends Element {
    private int sks;

    public Mahasiswa(String name, int sks) {
        super(name);
        this.sks = sks;
    }

    @Override
    public int getJamSibuk() {
        return sks * 3;
    }

    @Override
    public String toString() {
        return super.toString() + " dengan jam sibuk " + getJamSibuk();
    }
}