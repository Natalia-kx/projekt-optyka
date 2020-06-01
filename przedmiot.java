import java.util.Scanner;

public class przedmiot
{
    String nazwa;
    float ogniskowa;
    float promien;    // promien krzywizny zwierciadla
    float x;          // odległość przedmiotu od zwierciadła/soczewki
    float y;          // odległość obrazu od zwierciadła/soczewki
    float b;          // bezwzgledna z y
    float wynik;      // 1/y
    float p;          // powiekszenie
    float Z;          // zdolność skupiająca dla soczewki

    public przedmiot (String nazwa)
    {
        this.nazwa = nazwa;

    }
    public float pobierzpromien ()
    {
        System.out.println("Ile wynosi promien w " + nazwa + "?");
        Scanner promien1 = new Scanner(System.in);
        promien = promien1.nextFloat();
        return promien;
    }
    public float liczogniskowa ()
    {
        ogniskowa=promien/2;
        System.out.println("Skoro promień wynosi: "+promien+ ", to ogniskowa wynosi: " + ogniskowa);
        return ogniskowa;
    }

    public float pobierzX ()
    {
        System.out.println("Ile wynosi odległość przedmiotu od " + nazwa + "?");
        Scanner x1 = new Scanner(System.in);
        x = x1.nextFloat();
        return x;
    }
    public float liczY ()
    {
        wynik=(1/ogniskowa)-(1/x);
        b=1/wynik;
        if(b<0)
        {
            y=b*(-1);
        }
        else y=b;
        return y;
    }
    public float liczP()
    {
        p=y/x;
        return p;
    }
    public void wyswietlP() { System.out.println("Współczynnik powiększenia obrazu wynosi: "+p); }

    public void wyswietlY() { System.out.println("Odległość wyświetlanego obrazu od " +nazwa+" wynosi: " +y); }

}
