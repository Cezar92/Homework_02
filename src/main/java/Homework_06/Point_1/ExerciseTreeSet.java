package Homework_06.Point_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ExerciseTreeSet {
    public static void main(String[] args) {
        Persoane p1 = new Persoane("Gigel", 25);
        Persoane p2 = new Persoane("Aurel", 15);
        Persoane p3 = new Persoane("Eric",2);
        Persoane p4 = new Persoane("Eric",1);


        Comparator<Persoane> persComp = new Comparator<Persoane>() {
            @Override
            public int compare(Persoane o1, Persoane o2) {
                if(o1.getAge() > o2.getAge()){
                    return 1;
                }
                if(o1.getAge() < o2.getAge()){
                    return -1;
                }
                return 0;
            }
        };
        Comparator<Persoane> nameComparator = Comparator.comparing(Persoane::getName);
        Set<Persoane> personTreeSet = new TreeSet<>(persComp);
//        Set<Persoane> personTreeSet = new TreeSet<>(nameComparator);
        personTreeSet.add(p1);
        personTreeSet.add(p3);
        personTreeSet.add(p2);
        personTreeSet.add(p4);

        for (Persoane persoane : personTreeSet){
            System.out.println(persoane);
        }
    }
}
