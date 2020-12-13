package Homework_03;

public class Art_albums extends Books{
    String paperQuality ;

    public Art_albums(String n, int p, String paperQuality) {
        super(n, p);
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "Homework_03.Art_albums  {" +
                "paperQ = '" + paperQuality + '\'' +
                ", name = '" + name + '\'' +
                ", pageNr = " + pageNr +
                '}';
    }
}
