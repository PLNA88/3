public class Biblioteczka extends Ksiazka {
    public int strony;
    public int cena;

    public Biblioteczka(String tytul, String autor, int rok, Gatunek gatunek, int strony, int cena){
        super(tytul, autor, rok, gatunek);
        this.strony = strony;
        this.cena = cena;
    }

    public int getStrony(){
        return strony;
    }
    public int getCena(){
        return cena;
    }

    public void setStrony(int strony){
        this.strony = strony;
    }
    public void setCena(int cena){
        this.strony = cena;
    }

    public String toString(){
        return "Ilość stron: " + strony + ", cena: ";
    }
}