package facade;

public class Isik {
    private boolean[] durum;
    public Isik(int adet){
        durum = new boolean[adet];
    }
    public void setDurum(boolean[] durum) {
        this.durum = durum;
    }
    public boolean[] getDurum() {
        return durum;
    }
    public void ac(int index){
        durum[index] = true;
    }

    public void kapat(int index){
        durum[index] = false;
    }
}
