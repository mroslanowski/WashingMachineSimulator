package Pralka;

public class PompaDoWody {

    public static void wlaczPompe(int status){
        if(status == 0){
            System.out.println("Komunikat: Pompa wody została włączona");
        }
        else {
            System.out.println("Błąd: Sprawdź pompę wody");
        }
    }
    public static void wylaczPompe(){
        System.out.println("Komunikat: Pompa została wyłączona");
    }
}
