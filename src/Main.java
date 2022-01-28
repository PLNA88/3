import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */


        Ksiazka a = new Ksiazka("TOM HANKS ENIGMA", "DAVID GARDNER", 2021, Gatunek.BIOGRAFIA);
        System.out.println(a.toString());

        Ksiazka b = new Ksiazka("LUDZKIE DZIAŁANIE", "LUDWIG VON MISES", 2011, Gatunek.EKONOMIA);
        System.out.println(b.toString());

        Ksiazka c = new Ksiazka("ELON MUSK", "ASHLEE VANCE", 2017, Gatunek.BIOGRAFIA);
        System.out.println(c.toString());

        Ksiazka d = new Ksiazka("ATLAS ZBUNTOWANY", "AYN RAND", 2015, Gatunek.EKONOMIA);
        System.out.println(d.toString());


        ArrayList<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(a);
        ksiazki.add(b);
        ksiazki.add(c);
        ksiazki.add(d);


        System.out.println(ksiazki);
    }
}