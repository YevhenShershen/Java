package JavaLiern;
import java.io.File;

public class MainApp {

    public static void main(String[] args) {

        File file2 = new File("C:\\jaymiller\\web-junior\\Java");
        File plik1 = new File("plik1.txt");
        File plik2 = new File("plik2.txt");
        File plik3 = new File("plik3.txtm");

        File[] pliki = {plik1, plik2, plik3, file2};


        for (File f : pliki) {
            System.out.println("Plik z nazwa: " + f.getName());
            isFileExistence(f);
            System.out.println("============================");
                  }

    }

    private static void isFileExistence(File file) {
        if (file.exists()) {
            isFileText(file);
            System.out.println("Plik istnieje");
            readPath(file); }
        else{
            System.out.println("Plik nie istnieje");}
    }

    private static void readPath(File path) {
        if (path.isDirectory()){
            System.out.println("Katalog istnie na tej ścieżce");}
        else  {
            System.out.println("Nie ma takiego katalogu na tej ścieżce " + path);}
    }

    private static void isFileText(File readFile) {
        if (readFile.getName().endsWith("txt")) {
            System.out.println("Plik tekstowy"); }
        else {
            System.out.println("To nie jest Plik tekstowy");
        }
    }
    }
