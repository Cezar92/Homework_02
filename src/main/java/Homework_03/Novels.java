package Homework_03;

public class Novels extends Books {
    String type;


    public Novels(String n, int p, String type) {
        super(n, p);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Homework_03.Novels"+'\t'+'\t'+"{" +
                " type = '" + type + '\'' +
                ", name = '" + name + '\'' +
                ", pageNr = " + pageNr +
                '}';
    }
}
