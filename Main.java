package Pralka;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pralka pralka = new Pralka();
        menu(pralka);
    }
    public static void menu(Pralka pralka) {
        int wybor;
        do {
            System.out.println("Menu:");
            System.out.println("1. Program POST");
            System.out.println("2. Włącz podzespoły");
            System.out.println("3. Ustaw program ręcznie");
            System.out.println("4. Ustaw program pranie delikatne");
            System.out.println("5. Ustaw program pranie szybkie");
            System.out.println("6. Ustaw program pranie mieszane");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz opcję: ");

            wybor = wczytajLiczbe();

            switch (wybor) {
                case 1:
                    pralka.przygotujCzujniki();
                    break;
                case 2:
                    pralka.wlaczPodzespoly();
                    break;
                case 3:
                    System.out.print("Podaj prędkość (obr/min): ");
                    int predkosc = wczytajLiczbe();
                    System.out.print("Podaj temperaturę prania (* Celsjusza): ");
                    int temperatura = wczytajLiczbe();
                    System.out.print("Podaj czas prania wstępnego (minuty): ");
                    int pw = wczytajLiczbe();
                    System.out.print("Podaj czas prania zasadniczego (minuty): ");
                    int pz = wczytajLiczbe();
                    pralka.symulujPranie(predkosc, temperatura, pw, pz);
                    break;
                case 4:
                    predkosc = 600;
                    temperatura = 30;
                    pw = 10;
                    pz = 40;
                    pralka.symulujPranie(predkosc, temperatura, pw, pz);
                    break;
                case 5:
                    predkosc = 1200;
                    temperatura = 20;
                    pw = 0;
                    pz = 30;
                    pralka.symulujPranie(predkosc, temperatura, pw, pz);
                    break;
                case 6:
                    predkosc = 1000;
                    temperatura = 45;
                    pw = 25;
                    pz = 95;
                    pralka.symulujPranie(predkosc, temperatura, pw, pz);
                    break;
                case 0:
                    System.out.println("Wyjście z programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                    break;
            }

        } while (wybor != 0);
    }

    public static int wczytajLiczbe() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("To nie jest liczba. Spróbuj ponownie.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}