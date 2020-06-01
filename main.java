import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        zwierciadlowklesle zwierciadlo1 = new zwierciadlowklesle("Zwierciadło Wklęsłe");
        zwierciadlowypukle zwierciadlo2 = new zwierciadlowypukle("Zwierciadło Wypukłe");
        soczewkaskupiajaca soczewka1 = new soczewkaskupiajaca("Soczewka Skupiająca");
        soczewkarozpraszajaca soczewka2 = new soczewkarozpraszajaca("Soczewka Rozpraszająca");
        definicje definicje = new definicje();
        definicje.pobierzdefinicje();
        System.out.println();
        System.out.println("WITAJ W KALKULATORZE OPTYKI!");
        int wybor2 = 0;
        do {
            System.out.println(" ");
            System.out.println("Które działanie chcesz wykonać?");
            System.out.println("1 - Przypomnij sobie definicje oraz wzory");
            System.out.println("2 - Sprawdź obraz dla Zwierciadeł");
            System.out.println("3 - Sprawdź obraz dla Soczewek");
            System.out.println("4 - Wyjście z kalkulatora");
            Scanner wybor = new Scanner(System.in);
            int wybor1 = wybor.nextInt();
            if(wybor1==1)
            {
                System.out.println("Jaką informację chcesz uzyskać?");
                System.out.println("1 - Definicje cech obrazu");
                System.out.println("2 - Wzór na ogniskową zwierciadła");
                System.out.println("3 - Wzór na równanie zwierciadła/soczewki");
                System.out.println("4 - Wzór na zdolność skupiającą soczewki");
                System.out.println("5 - Wzór na współczynnik powiększenia");
                Scanner pomoc = new Scanner(System.in);
                int pomoc1 = pomoc.nextInt();
                if(pomoc1==1) definicje.wyswietlCechy();
                if(pomoc1==2) definicje.wyswietlDef1();
                if(pomoc1==3) definicje.wyswietlDef2();
                if(pomoc1==4) definicje.wyswietlDef3();
                if(pomoc1==5) definicje.wyswietlDef4();

            }
            if (wybor1 == 2) {
                System.out.println("Wybierz: ");
                System.out.println("1 - Zwierciadło wklęsłe");
                System.out.println("2 - Zwierciadło wypukłe");
                Scanner nazwa = new Scanner(System.in);
                int rodzaj = nazwa.nextInt();
                if (rodzaj == 1) {
                    zwierciadlo1.pobierzpromien();
                    zwierciadlo1.liczogniskowa();
                    zwierciadlo1.pobierzX();
                    zwierciadlo1.liczY();
                    zwierciadlo1.rzeczywistyCzyPozorny();
                    zwierciadlo1.prostyCzyOdwrócony();
                    zwierciadlo1.liczP();
                    zwierciadlo1.rozmiar();
                    zwierciadlo1.sprawdzObrazWklesle();
                    zwierciadlo1.wyswietlP();
                    zwierciadlo1.wyswietlY();
                }
                if (rodzaj == 2) {
                    zwierciadlo2.pobierzpromien();
                    zwierciadlo2.liczogniskowa();
                    zwierciadlo2.pobierzX();
                    zwierciadlo2.sprawdzObrazWypukle();
                    zwierciadlo2.liczY();
                    zwierciadlo2.liczP();
                    zwierciadlo2.wyswietlP();
                    zwierciadlo2.wyswietlY();
                }

            }
            if (wybor1 == 3) {
                System.out.println("Dla jakiej soczewki chcesz sprawdzić obraz?");
                System.out.println("1 - Soczewka skupiająca");
                System.out.println("2 - Soczewka rozpraszająca");
                Scanner nazwa = new Scanner(System.in);
                int rodzaj = nazwa.nextInt();
                if (rodzaj == 1) {
                    soczewka1.pobierzogniskowaD();
                    soczewka1.pobierzX();
                    soczewka1.liczY();
                    soczewka1.liczP();
                    soczewka1.rzeczywistyCzyPozorny();
                    soczewka1.prostyCzyOdwrócony();
                    soczewka1.rozmiar();
                    soczewka1.sprawdzObrazWklesle();
                    soczewka1.wyswietlP();
                    soczewka1.wyswietlY();
                    soczewka1.liczZ();
                }
                if (rodzaj == 2) {
                    soczewka2.pobierzogniskowaU();
                    soczewka2.pobierzX();
                    soczewka2.sprawdzObrazWypukle();
                    soczewka2.liczY();
                    soczewka2.liczP();
                    soczewka2.wyswietlP();
                    soczewka2.wyswietlY();
                    soczewka2.liczZ();

                }
            }

                if (wybor1 == 4) {
                    System.out.println("Dziękujemy za skorzystanie z kalkulatora!");
                    wybor2++;
                }
        }
            while (wybor2 != 1) ;
    }
}
