package Pralka;

public class Zegar {
    private int czasPW;
    private int czasPZ;
    public Zegar(int czasPW, int czasPZ){
        this.czasPW = czasPW;
        this.czasPZ = czasPZ;
    }
    public Zegar(){
    }

    public void odliczaniePW(int czasPW){
        for(int i = czasPW; i >= 0; i--){
            System.out.println("Licznik PW: " + i + " minut");
            if((i % 5 == 0) && (i != 0)){
                PojemnikNaDetergenty.dodajDetergent();
            }
        }

    }
    public void odliczaniePZ(int czasPZ){
        for(int i = czasPZ; i >= 0; i--){
            System.out.println("Licznik PZ: " + i + " minut");
            if((i % 5 == 0) && (i > 14)){
                PojemnikNaDetergenty.dodajDetergent();
            }
        }
    }

    public int getCzasPW() {
        return czasPW;
    }
    public int getCzasPZ() {
        return czasPZ;
    }
}
