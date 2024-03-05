package Pralka;

public class CzujnikWagiBebna {
    private int status;
    private int waga;
    public CzujnikWagiBebna(int status){
        this.status = status;
    }
    public void sprawdzR(){
        if (status == 0){
            waga = (int) (Math.random() * 9)+1;
            System.out.println("Masa zawartości bębna wynosi: " + waga);
        }
        else System.out.println("Za dużo prania w bębnie");
    }
    public void sprawdz(){
        System.out.println("Masa zawartości bębna wynosi: " + waga);
    }
    public void przygotujCzujnik() {
        this.status = 0;
        System.out.println("Czujnik wagi bebna jest gotowy do pracy.");
    }
    public void setWaga(int waga){
        this.waga = waga;
    }
}
