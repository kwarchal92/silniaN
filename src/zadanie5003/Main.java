package zadanie5003;

interface Liczba{
    int pobierzWartosc(int a);
}
public class Main {
    public static void main(String[] args)
    {
        Liczba silnia = (n) -> //wyrazenie lambda dla n silnia
        {
            int wynik = 1;

            for (int i = 1; i <= n; i++)
            {
                wynik = i * wynik;
            }
            return wynik;
        };

        System.out.println("Silnia liczby 10 wynosi: " + silnia.pobierzWartosc(10) + ".");
    }

}
