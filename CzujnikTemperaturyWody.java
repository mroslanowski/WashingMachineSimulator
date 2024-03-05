package Pralka;

public class CzujnikTemperaturyWody {
    private int temperatura;
    private int status;
    public CzujnikTemperaturyWody(int status) {
        this.status = status;
    }
    public void setTemperatura(int temperatura){
        this.temperatura = temperatura;
    }
    public void odczytajTemperatureR(){
        if (status == 0) {
            temperatura = (int) (Math.random() * 100);
            System.out.println("Ciśnienie wynosi: " + temperatura);
        } else {
            System.out.println("Błąd: Czujnik temperatury nie jest gotowy do pracy.");
        }
    }
    public void odczytajTemperature(){
        System.out.println("Temperatura wynosi: " + temperatura);
    }
    public void przygotujCzujnik() {
        this.status = 0;
        System.out.println("Czujnik temperatury jest gotowy do pracy.");
    }

}
