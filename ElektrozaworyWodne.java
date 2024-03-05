package Pralka;

public class ElektrozaworyWodne {
    private CzujnikPoziomuWody czujnik = new CzujnikPoziomuWody(0);
    public void wlacz(){
        System.out.println("Zawór został włączony");
    }
    public void wylacz(){
        System.out.println("Zawór został wyłączony");
    }
    public void sprawdz(){
        czujnik.odczytajPoziomWody();
        if(czujnik.poziom > 70){
            wylacz();
        }
        czujnik.odczytajPoziomWody();
    }
}
