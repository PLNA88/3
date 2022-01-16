import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String Praktyki(boolean praktyki) {
        String p;
        if (praktyki==true)
            p = "Zaakceptowane";
        else
            p = "Do wykonania";
        return p;
    }

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */


        Student x1 = new Student();
        Student x2 = new Student();
        Student x3 = new Student();

        x1.imie = "Paulina";
        x1.nazwisko = "Gigowska";
        x1.id = 40801;
        x1.praktyki = false;

        x2.imie = "Anna";
        x2.nazwisko = "Kowalska";
        x2.id = 54729;
        x2.praktyki = true;

        x3.imie = "Adam";
        x3.nazwisko = "Nowak";
        x3.id = 82254;
        x3.praktyki = false;

        Student[] tablica1 = new Student[3];
        tablica1[0] = x1;
        tablica1[1] = x2;
        tablica1[2] = x3;

        for (Student i : tablica1
        ) {
            System.out.format("\n%-10s%-20s%-10s%-10s", i.imie, i.nazwisko, i.id, Praktyki(i.praktyki));
        }


    }
}
