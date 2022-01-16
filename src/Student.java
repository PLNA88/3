public class Student {
    private Osoba osoba;
    private WydzialEnum wydzial;

    public Student(Osoba osoba, WydzialEnum wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }


    public Osoba getOsoba() {
        return osoba;
    }
    public WydzialEnum getWydzial() {
        return wydzial;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
    public void setWydzial(WydzialEnum wydzial) {
        this.wydzial = wydzial;
    }


    @Override
    public String toString()
    {return "Student {" +
            osoba.toString() +
            " Wydział: " + wydzial.toString() +
            '}';
    }
}