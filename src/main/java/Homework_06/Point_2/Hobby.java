package Homework_06.Point_2;

import java.util.HashSet;
import java.util.List;

public class Hobby {
    String hobbyName;
    int frequency;
    List<Adrese> adreseList;

    public Hobby(String hobbyName, int frequency, List<Adrese> adreseList) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.adreseList = adreseList;
    }

    @Override
    public String toString() {
        return
                "Hobby Name='" + hobbyName + '\'' +
                ", Frequency=" + frequency +
                ", AdreseList " + adreseList;
    }
}
