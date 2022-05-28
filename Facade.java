package facade;

public class Facade {
    public Klima klima;
    public Kapi kapi;
    public Isik isik;
    public Televizyon tv;

    public Facade(){
        klima = new Klima();
        kapi = new Kapi();
        isik = new Isik(3);
        tv = new Televizyon();
    }

    public void klimaAc(){
        klima.ac();
    }
    public void klimaKapat(){
        klima.kapat();
    } 
    public void kapiKkilitle(){
        kapi.kilitle();
    }

    public void kapiAc(){
        kapi.kilitAc();
    }
    public void isikAc(int sayi){
        isik.ac(sayi);
    }
    public void isikKkapat(int sayi){
        isik.kapat(sayi);
    }
    public void tvAac(){
        tv.ac();
    }
    public void tvKapat(){
        tv.kapat();
    }
    public void tvSesAzalt(){
        tv.sesAzalt();
    }
    public void tvSesArtir(){
        tv.sesArtir();
    }
    public void tvKanalAzalt(){
        tv.kanalAzalt();
    }
    public void tvKanalArtir(){
        tv.kanalArtir();
    }

}
