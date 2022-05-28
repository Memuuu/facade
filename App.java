package facade;


public class App {
    public static void main(String[] args) throws Exception {
        Facade facade=new Facade();
        facade.klimaKapat();
        facade.klimaGuncelle(5);
        facade.isikac(2);

    }
}