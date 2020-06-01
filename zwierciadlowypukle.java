public class zwierciadlowypukle extends przedmiot{
    public zwierciadlowypukle (String nazwa)
    {
        super (nazwa);
    }

    @Override
    public String toString() { return nazwa ; }

    public void sprawdzObrazWypukle()
    {
        System.out.println("Dla każdej odległości obrazu od "+nazwa+" obraz powstaje: pozorny, prosty, pomniejszony.");
    }

}
