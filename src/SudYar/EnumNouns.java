package SudYar;

public enum EnumNouns {
    HOUSE("доме"),
    COMMENTS( "замечаниями"),
    TABLE("столом");

    private String name;

    EnumNouns(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EnumNouns{" +
                "name='" + name + '\'' +
                '}';
    }
}
