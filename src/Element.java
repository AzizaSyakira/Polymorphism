public class Element {
    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getJamSibuk() {
        return 0; 
    }

    @Override
    public String toString() {
        return getName() + " adalah seorang " + getClass().getSimpleName();
    }
}