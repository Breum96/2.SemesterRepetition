package kø_struktur.queues.bryghus;

public class Produkt
{
    String navn;

    public Produkt(String navn)
    {
        this.navn = navn;
    }

    public String getNavn()
    {
        return navn;
    }

    @Override
    public String toString()
    {
        return navn;
    }
}
