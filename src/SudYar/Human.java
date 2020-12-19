package SudYar;

import java.util.Objects;

public abstract class Human{
    private String name;
    private String adjective;
    private String pronoun;
    private String facePart;


    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getFacePart() { return facePart; }

    public void setFacePart(String facePart) { this.facePart = facePart; }

    public Human(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(getName(), human.getName()) &&
                Objects.equals(getAdjective(), human.getAdjective()) &&
                Objects.equals(getPronoun(), human.getPronoun()) &&
                Objects.equals(getFacePart(), human.getFacePart());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAdjective(), getPronoun(), getFacePart());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", adjective='" + adjective + '\'' +
                ", pronoun='" + pronoun + '\'' +
                ", facePart='" + facePart + '\'' +
                '}';
    }
}
