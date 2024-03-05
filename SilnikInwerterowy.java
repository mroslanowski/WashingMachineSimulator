package Pralka;

public class SilnikInwerterowy {
    private int predkoscWirowania;
    public void ustawPredkosc(int predkoscWirowania){
        if((predkoscWirowania >= 2000) && (predkoscWirowania <0)){
            System.out.println("Błąd: Nieprawidłowa prędkość wirowania");
        }
        else System.out.println("Prędkość wirowania: " + predkoscWirowania + " obr/min");
    }
    public  void sprawdzR() {
        predkoscWirowania = (int) (Math.random() * 1600)+400;;
        System.out.println("Prędkość wirowania: " + predkoscWirowania + " obr/min");
    }
    public void sprawdz(){
        System.out.println("Prędkość wirowania: " + predkoscWirowania + " obr/min");
    }
    public void wlacz(){
        System.out.println("Silnik został włączony");
    }
    public void wylacz(){
        System.out.println("Silnik został wyłączony");
    }
}
