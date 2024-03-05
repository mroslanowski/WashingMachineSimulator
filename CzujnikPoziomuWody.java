package Pralka;

public class CzujnikPoziomuWody {
    private int status;
    int poziom;
    public CzujnikPoziomuWody(int status) {
        this.status = status;
    }
    public void odczytajPoziomWody() {
        if (status == 0) {
            poziom = (int) (Math.random() * 40)+60;
            System.out.println("Poziom wody wynosi: " + poziom + " %");
        } else {
            System.out.println("Błąd: Czujnik poziomu wody nie jest gotowy do pracy.");
        }
    }
    public void przygotujCzujnik() {
        this.status = 0; // 0 oznacza, że czujnik jest gotowy do pracy
        System.out.println("Czujnik poziomu wody jest gotowy do pracy.");
    }
}