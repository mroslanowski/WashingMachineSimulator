package Pralka;

public class GrzalkaDoWody {
    CzujnikTemperaturyWody czujnik = new CzujnikTemperaturyWody(0);
    public void sprawdz(){
        czujnik.odczytajTemperature();
    }
    public void  wlacz(){
        System.out.println("Grzałka zostałą włączona");
    }
    public void  wylacz(){
        System.out.println("Grzałka zostałą wyłączona");
    }
}
