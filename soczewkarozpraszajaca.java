import java.util.Scanner;

public class soczewkarozpraszajaca extends zwierciadlowypukle {

    public soczewkarozpraszajaca (String nazwa)
    {
        super (nazwa);
    }

    @Override
    public String toString() { return nazwa ; }

    public float pobierzogniskowaU () {
        do {
            System.out.println("Ile wynosi wartość ogniskowej w " + nazwa + "?");
            Scanner ogniskowa1 = new Scanner(System.in);
            ogniskowa = ogniskowa1.nextFloat();
            if (ogniskowa > 0) {
                System.out.println("Ognisko w " + nazwa + " jest pozorne, więc wartość ogniskowej musi być mniejsza od 0");
            }
        } while (ogniskowa>0);
        return ogniskowa;
    }

    public float liczZ ()
        {
            Z=1/ogniskowa;
            System.out.println("Zdolność skupiająca w "+nazwa+ " wynosi: "+Z);
            return Z;
        }
    }

