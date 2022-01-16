public class Ksiazka {
    private String tytul;
    private String autor;
    protected int rok;


    public Ksiazka(){
        this.tytul = tytul;
        this.autor = autor;
        this.rok = rok;
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


    public void setTytul(String tytul){
        this.tytul = tytul;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setRok(int rok){
        this.rok = rok;
    }


    public String toString(){
        return "Książka ''" + tytul + "'' z " + rok + " jest autorstwa " + autor;
    }
}