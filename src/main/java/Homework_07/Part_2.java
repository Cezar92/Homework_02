package Homework_07;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Part_2 {

    public static void main(String[] args) {
        String str = "C:\\Users\\Cezar Marius\\Desktop\\Curs Programare\\02_Bazele java Development\\Homework";
        Path path = Paths.get("C:\\Users\\Cezar Marius\\Desktop\\Curs Programare\\02_Bazele java Development\\Homework");
//        showAllFiles(str);
//        showByExtension(str);
        checkIfExist(str+"\\"+"src");

    }
//1. Implement a method to get a list of all file/directory names from the given.
    private static void showAllFiles(String str) {
        String[] pathnames;
        File f = new File(str);
        pathnames = f.list();
        for (String pathname : pathnames) {
            System.out.println(pathname);
        }
    }

//    2. Implement a method to get specific files by extensions from a specified folder.
    private static void showByExtension(String str) {
        File file = new File(str);
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".bat")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String f : list) {
            System.out.println(f);
        }
    }

//    3. Implement a method to check if a file or directory specified by pathname exists or not.
    private static void checkIfExist(String str) {
        File my_file_dir = new File(str);
        if (my_file_dir.exists()) {
            System.out.println("The directory or file exists.\n");
        } else {
            System.out.println("The directory or file does not exist.\n");
        }
    }

}


