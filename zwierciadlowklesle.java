import java.util.Scanner;

public class zwierciadlowklesle extends przedmiot {
    String obraz1;  // rzeczywisty czy pozorny
    String obraz2;  // prosty czy odwrócony
    String obraz3;  // pomniejszony czy powiekszony

    public zwierciadlowklesle (String nazwa)
    {
        super (nazwa);
    }

    @Override
    public String toString() { return nazwa ; }


    public String rzeczywistyCzyPozorny()
    {
       if(x<ogniskowa)
       {
           obraz1="pozorny";
       }
       else obraz1="rzeczywisty";
       return obraz1;
    }

    public String prostyCzyOdwrócony()
    {
        if(x<ogniskowa)
        {
            obraz2="prosty";
        }
        else obraz2="odwrócony";
        return obraz2;
    }

    public String rozmiar()
    {
        if(x<ogniskowa || x>ogniskowa && x<promien)
        {
            obraz3 ="powiększony";
        }
        if(x==promien)
        {
            obraz3="takich samych rozmiarów";
        }
        if(x>promien)
        {
            obraz3="pomniejszony";
        }
        return obraz3;
    }

    public void sprawdzObrazWklesle()
    {
        if(x==ogniskowa) System.out.println("Nie można utworzyć obrazu.");
        else System.out.println("Obraz odbity od "+nazwa+" jest: " +obraz1+", "+obraz2+", "+obraz3+".");
    }

}
