package Pralka;

public class CzujnikCisnieniaWody {
    private int cisnienie;
    private int status;
    public CzujnikCisnieniaWody(int status) {
        this.status = status; // 0 oznacza, że czujnik jest gotowy do pracy
    }
    public void odczytajCisnienie() {
        if (status == 0) {
            cisnienie = (int) (Math.random() * 40) + 20;
            System.out.println("Ciśnienie wynosi: " + cisnienie);
        } else {
            System.out.println("Błąd: Czujnik ciśnienia nie jest gotowy do pracy.");
        }
    }
    public void przygotujCzujnik() {
        this.status = 0;
        System.out.println("Czujnik ciśnienia jest gotowy do pracy.");
    }
}