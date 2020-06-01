import java.util.Scanner;

public class soczewkaskupiajaca extends zwierciadlowklesle {
    public soczewkaskupiajaca (String nazwa)
    {
        super (nazwa);
    }

    @Override
    public String toString() { return nazwa ; }

    public float pobierzogniskowaD ()
    {   do {
        System.out.println("Ile wynosi wartość ogniskowej w " + nazwa + "?");
        Scanner ogniskowa1 = new Scanner(System.in);
        ogniskowa = ogniskowa1.nextFloat();
        if(ogniskowa<0) {
            System.out.println("Ognisko w " +nazwa+" jest rzeczywiste, więc wartość ogniskowej musi być większa od 0");
        }
    }while(ogniskowa<0);
        return ogniskowa;
    }

    public float liczZ ()
    {
        Z=1/ogniskowa;
        System.out.println("Zdolność skupiająca w "+nazwa+ " wynosi: "+Z);
        return Z;
    }

}
