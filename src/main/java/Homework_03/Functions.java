package Homework_03;

public class Functions {

    public static void add() {
        Books b1 = new Novels("Incendiar", 300, "SF");
        Books b2 = new Novels("Morometii", 400, "Roman");
        Books b3 = new Novels("Ion", 500, "Roman");
        Books a1 = new Art_albums("Contemporan Art", 80, "Good");
        Books a2 = new Art_albums("Modern Art", 50, "Verry Good");
        Books a3 = new Art_albums("SF Art", 60, "Poor");
        Books a4 = new Art_albums("NewArt", 110,"The best");
        Books[] Library = new Books[]{b1, b2, b3, a1, a2, a3};
        Books[] Library2 = new Books[Library.length + 1];
        for (int i = 0; i < Library.length; i++) {
            Library2[i] = Library[i];
        }
        Library2[Library2.length - 1] = a4;
        for (int i = 0; i < Library2.length; i++) {
            System.out.println(Library2[i]);
        }
    }

    public static void list(){
        Books b1 = new Novels("Incendiar", 300, "SF");
        Books b2 = new Novels("Morometii", 400, "Roman");
        Books b3 = new Novels("Ion", 500, "Roman");
        Books a1 = new Art_albums("Contemporan Art", 80, "Good");
        Books a2 = new Art_albums("Modern Art", 50, "Verry Good");
        Books a3 = new Art_albums("SF Art", 60, "Poor");
        Books[] Library = new Books[]{b1, b2, b3, a1, a2, a3};
        for (int i = 0; i < Library.length; i++) {
            System.out.println(Library[i]);
        }
    }
    public static void delete(){
        Books b1 = new Novels(" Incendiar", 300, " SF");
        Books b2 = new Novels(" Morometii", 400, " Roman");
        Books b3 = new Novels(" Ion", 500, " Roman");
        Books a1 = new Art_albums(" Contemporan Art", 80, " Good");
        Books a2 = new Art_albums(" Modern Art", 50, " Verry Good");
        Books a3 = new Art_albums(" SF Art", 60, " Poor");
        Books a4 = new Art_albums(" NewArt", 110," The best");
        Books[] Library = new Books[]{b1, b2, b3, a1, a2, a3};
        Books[] Library3 = new Books[Library.length-1];
        for (int i = 0; i < Library.length-1; i++) {
            Library3[i] = Library[i];
        }
        for (int i = 0; i < Library3.length; i++) {
            System.out.println(Library3[i]);
        }
    }
}
