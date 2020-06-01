import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class definicje {
    String zdanie1;
    String zdanie2;
    String zdanie3;
    String zdanie4;
    String zdanie5;
    String zdanie6;
    String zdanie7;
    String def1;
    String def1a;
    String def2;
    String def2a;
    String def2b;
    String def2c;
    String def2d;
    String def3;
    String def3a;
    String def3b;
    String def3c;
    String def4;
    String def4a;
    public void pobierzdefinicje() throws FileNotFoundException {
        File file = new File("definicje.txt");
        Scanner sc = new Scanner(file);
        try {
            zdanie1 = Files.readAllLines(Paths.get("definicje.txt")).get(0);
            zdanie2 = Files.readAllLines(Paths.get("definicje.txt")).get(1);
            zdanie3 = Files.readAllLines(Paths.get("definicje.txt")).get(2);
            zdanie4 = Files.readAllLines(Paths.get("definicje.txt")).get(3);
            zdanie5 = Files.readAllLines(Paths.get("definicje.txt")).get(4);
            zdanie6 = Files.readAllLines(Paths.get("definicje.txt")).get(5);
            zdanie7 = Files.readAllLines(Paths.get("definicje.txt")).get(6);
            def1 = Files.readAllLines(Paths.get("definicje.txt")).get(7);
            def1a = Files.readAllLines(Paths.get("definicje.txt")).get(8);
            def2 = Files.readAllLines(Paths.get("definicje.txt")).get(9);
            def2a = Files.readAllLines(Paths.get("definicje.txt")).get(10);
            def2b = Files.readAllLines(Paths.get("definicje.txt")).get(11);
            def2c = Files.readAllLines(Paths.get("definicje.txt")).get(12);
            def2d = Files.readAllLines(Paths.get("definicje.txt")).get(13);
            def3 = Files.readAllLines(Paths.get("definicje.txt")).get(14);
            def3a = Files.readAllLines(Paths.get("definicje.txt")).get(15);
            def3b = Files.readAllLines(Paths.get("definicje.txt")).get(16);
            def3c = Files.readAllLines(Paths.get("definicje.txt")).get(17);
            def4 = Files.readAllLines(Paths.get("definicje.txt")).get(18);
            def4a = Files.readAllLines(Paths.get("definicje.txt")).get(19);

        }
        catch (IOException e) {
            {
                System.out.println("Błąd" + e.getMessage());
            }

        }
    }
public void wyswietlCechy()
    {
        System.out.println(zdanie1);
        System.out.println(zdanie2);
        System.out.println(zdanie3);
        System.out.println(zdanie4);
        System.out.println(zdanie5);
        System.out.println(zdanie6);
        System.out.println(zdanie7);
    }
    public void wyswietlDef1 ()
    {
        System.out.println(def1);
        System.out.println(def1a);
    }
    public void wyswietlDef2()
    {
        System.out.println(def2);
        System.out.println(def2a);
        System.out.println(def2b);
        System.out.println(def2c);
        System.out.println(def2d);
    }
    public void wyswietlDef3 ()
    {
        System.out.println(def3);
        System.out.println(def3a);
        System.out.println(def3b);
        System.out.println(def3c);

    }
    public void wyswietlDef4 ()
    {
        System.out.println(def4);
        System.out.println(def4a);
    }
}

