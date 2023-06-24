public class Corbalar extends anaYemekler{
    private String mercimek=" mercimek";
    private String ezogelin=" ezogelin";
    private String tarhana=" tarhana";
    private String lebniye=" lebniye";
    Kaloriler menu= new Kaloriler();

    public void getMenu (){
        System.out.println("Corbalar");
        System.out.println("7- "+this.mercimek+" (Kalori degeri= "+menu.getCorbaKalori()+")");
        System.out.println("8- "+this.ezogelin+" (Kalori degeri= "+menu.getCorbaKalori()+")");
        System.out.println("9- "+this.tarhana+" (Kalori degeri= "+menu.getCorbaKalori()+")");
        System.out.println("10- "+this.lebniye+" (Kalori degeri= "+menu.getCorbaKalori()+")");

        System.out.println("11- yemek secimi yapmak istemiyorum");
    }
    public String getMercimek() {
        return mercimek;
    }

    public String getEzogelin() {
        return ezogelin;
    }

    public String getTarhana() {
        return tarhana;
    }

    public String getLebniye() {
        return lebniye;
    }
    public static void siparisAlindiCorbalar() {

        System.out.println("Siparişiniz alınmıştır ################ (çorba)");
    }
    @Override
    public void hazirla() {
        System.out.println("Çorba hazırlanıyor...");
    }

    @Override
    public void pisir() {
        System.out.println("Çorba pişiriliyor...");
    }
    @Override
    public void tuzEkle() {
        System.out.println("Çorba tuz ekleniyor...");
    }

}
