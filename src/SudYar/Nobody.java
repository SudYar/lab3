package SudYar;

public class Nobody extends Human implements Missing{
    public Nobody(String name) { super(name); }

    @Override
    public String noHere() {
        return "нет";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
