package Homework_06.Point_1;

public class Persoane{
    String name;
    int age;

    public Persoane(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    @Override
//    public int compareTo(Persoane o){
//        return this.name.compareTo(o.getName());
//    }

    @Override
    public String toString() {
        return "Persoane{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
