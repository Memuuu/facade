package facade;

public class Televizyon {
   
    private int sesSeviye;
    private int kanalNumara;

    public int getSesSeviye() {
        return sesSeviye;
    }

    public void setSesSeviye(int sesSeviye) {
        this.sesSeviye = sesSeviye;
    }

    public int getKanalNumara() {
        return kanalNumara;
    }

    public void setKanalNumara(int kanalNumara) {
        this.kanalNumara = kanalNumara;
    }

    // private void Televizyon(){

    // }

    public void ac(){
        System.out.println("Televizyon açıldı");
        setKanalNumara(1);
        setSesSeviye(10);
    }

    public void kapat(){
        System.out.println("Televizyon kapatıldı");
        setKanalNumara(1);
        setSesSeviye(10);
    }
    public void sesAzalt(){
        setSesSeviye(getSesSeviye()-1);

    }
    public void sesArtir(){
        setSesSeviye(getSesSeviye()+1);
    }
    public void kanalAzalt(){
        setKanalNumara(getKanalNumara()-1);
    }
    public void kanalArtir(){
        setKanalNumara(getKanalNumara()+1);
    }

}
