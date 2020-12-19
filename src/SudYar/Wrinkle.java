package SudYar;

import java.util.Objects;

public class Wrinkle implements Appearing{
    private String name;

    public String showUp(String place){
        return place + " появляется";
    }

    public Wrinkle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wrinkle)) return false;
        Wrinkle wrinkle = (Wrinkle) o;
        return Objects.equals(getName(), wrinkle.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Wrinkle{" +
                "name='" + name + '\'' +
                '}';
    }
}
