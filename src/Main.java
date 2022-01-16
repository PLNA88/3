import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        ArrayList<Student> studenci = new ArrayList<>();
        studenci.add(new Student(new Osoba("Bruce", "Wayne", 67906), WydzialEnum.Biznes));
        studenci.add(new Student(new Osoba("Selina", "Kyle", 58263), WydzialEnum.Prawo));
        studenci.add(new Student(new Osoba("Harvey", "Dent", 58273), WydzialEnum.Informatyka));
        studenci.add(new Student(new Osoba("James", "Gordon", 28471), WydzialEnum.Administracja));
        studenci.add(new Student(new Osoba("Oswald", "Cobblepot", 37294), WydzialEnum.Biznes));

        for (Student student:studenci){
            System.out.println(student.toString());
        }
    }
}