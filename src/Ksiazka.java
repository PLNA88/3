public class Ksiazka {
    private String tytul;
    private String autor;
    protected int rok;
    protected Gatunek gatunek;

    public Ksiazka(String tytul, String autor, int rok, Gatunek gatunek){
        this.tytul = tytul;
        this.autor = autor;
        this.rok = rok;
        this.gatunek = gatunek;
    }

    public String getTytul(){
        return tytul;
    }
    public String getAutor(){
        return autor;
    }
    public int getRok(){
        return rok;
    }
    public Gatunek getGatunek(){
        return gatunek;
    }

    public void setTytul(String tytul){
        this.tytul = tytul;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setRok(int rok){
        this.rok = rok;
    }
    public void setGatunek(Gatunek gatunek){
        this.gatunek = gatunek;
    }

    public String toString(){
        return "Tytuł: " + tytul + ", autor: " + autor + ", rok wydania: " + rok + ", gatunek: " + gatunek;
    }
}