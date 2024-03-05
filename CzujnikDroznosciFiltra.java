package Pralka;

public class CzujnikDroznosciFiltra {
    private int status;
    public CzujnikDroznosciFiltra(int status) {
        this.status = status;
    }
    public void sprawdzCzyDrozny() {
        if (status == 0) {
            System.out.println("Filtr jest czysty.");
    }
        else System.out.println("Błąd: Filtr jest zapchany. Należy wyczyścić filtr.");
    }

    public void przygotujCzujnik() {
        this.status = 0;
        System.out.println("Czujnik drożności filtra jest gotowy do pracy.");
    }
}
