package Homework_06.Point_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Gigi", 44);
        Person p2 = new Person("Alex", 52);
        HashSet Adresses = new HashSet();
        Adrese a1 = new Adrese("Bucuresti", "Romania");
        Adrese a2 = new Adrese("Pitesti", "Romania");
        Adrese a3 = new Adrese("Hamburg", "Germany");
        Adrese a4 = new Adrese("Nurburgring", "Germany");
        List<Adrese> l1 = new ArrayList<>();
        List<Adrese> l2 = new ArrayList<>();
        l1.add(a1);
        l1.add(a2);
        l2.add(a3);
        l2.add(a4);
        Hobby hobby1 = new Hobby("Swim", 20, l1);
        Hobby hobby2 = new Hobby("Racing", 10, l2);

        List<Hobby> hobbyList1 = new ArrayList<>();
        List<Hobby> hobbyList2 = new ArrayList<>();
        hobbyList1.add(hobby1);
        hobbyList2.add(hobby2);
        HashMap<Object, List> h1 = new HashMap<Object, List>();
        h1.put(p1, hobbyList1);
        h1.put(p2, hobbyList2);

        System.out.println(h1.entrySet());
    }
}
