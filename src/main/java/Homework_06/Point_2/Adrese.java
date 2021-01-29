package Homework_06.Point_2;

import java.util.HashSet;

public class Adrese {
    String oras;
    String tara;

    public Adrese(String oras, String tara) {
        this.oras = oras;
        this.tara = tara;
    }

    @Override
    public String toString() {
        return
                "Oras='" + oras + '\'' +
                ", Tara='" + tara + '\'';
    }
}
