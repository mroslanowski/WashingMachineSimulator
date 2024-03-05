package Pralka;

public class Pralka {
    private GrzalkaDoWody grzalka = new GrzalkaDoWody();
    private Beben beben = new Beben();
    private FiltrWody filtrWody = new FiltrWody();
    private PompaDoWody pompaDoWody = new PompaDoWody();
    private ElektrozaworyWodne elektrozaworyWodne = new ElektrozaworyWodne();
    private SilnikInwerterowy silnikInwerterowy = new SilnikInwerterowy();
    private Zegar zegar = new Zegar();
    private PanelPrzedni panelPrzedni = new PanelPrzedni();

    private CzujnikCisnieniaWody czujnikCisnienia = new CzujnikCisnieniaWody(0);
    private CzujnikTemperaturyWody czujnikTemperatury = new CzujnikTemperaturyWody(0);
    private CzujnikPoziomuWody czujnikPoziomu = new CzujnikPoziomuWody(0);
    private CzujnikWagiBebna czujnikWagi = new CzujnikWagiBebna(0);
    private CzujnikDroznosciFiltra czujnikDroznosciFiltra = new CzujnikDroznosciFiltra(0);


    public void przygotujCzujniki(){
        panelPrzedni.wlacz();
        czujnikCisnienia.przygotujCzujnik();
        czujnikPoziomu.przygotujCzujnik();
        czujnikTemperatury.przygotujCzujnik();
        czujnikWagi.przygotujCzujnik();
        czujnikDroznosciFiltra.przygotujCzujnik();
    }
    public void wlaczPodzespoly(){
        elektrozaworyWodne.wlacz();
        grzalka.wlacz();
        silnikInwerterowy.wlacz();
    }
    public void wylaczPodzespoly(){
        elektrozaworyWodne.wylacz();
        grzalka.wylacz();
        silnikInwerterowy.wylacz();
        panelPrzedni.wylacz();
    }
    public void sprawdzDane(){
        elektrozaworyWodne.sprawdz();
        grzalka.sprawdz();
        silnikInwerterowy.sprawdz();
        czujnikWagi.sprawdz();
    }
    public void ustawProgram(int wirowanie, int temperatura){
        silnikInwerterowy.ustawPredkosc(wirowanie);
        czujnikTemperatury.setTemperatura(temperatura);
    }
    public void odliczanie(int czasPW, int czasPZ){
        zegar.odliczaniePW(czasPW);
        zegar.odliczaniePZ(czasPZ);
    }
    public void symulujPranie(int predkoscWirowania, int temperatura, int czasPrania, int czasPauzy) {
        przygotujCzujniki();
        wlaczPodzespoly();
        ustawProgram(predkoscWirowania, temperatura);
        odliczanie(czasPrania, czasPauzy);
        sprawdzDane();
        wylaczPodzespoly();
        sprawdzDane();
    }
}
