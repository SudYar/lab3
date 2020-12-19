package SudYar;

public class Julius extends Human implements Poor, Appearing {


    public Julius(String name) { super(name); }

    public String lived(String adj){
        return adj +" прожить";
    }
    public String weary(String adj){
        return "мучить " + adj;
    }
    public String pucky(){
        return "привередничать";
    }
    public String whining(){
        return "ныть";
    }

    @Override
    public String poor() {
        return "бедному";
    }

    @Override
    public String showUp(String place) {
        return "появляется " + place;
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
