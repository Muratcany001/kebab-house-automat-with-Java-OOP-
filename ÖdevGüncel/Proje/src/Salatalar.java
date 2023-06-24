public class Salatalar extends anaYemekler {
    private String mevsim="mevsim";
    private String ezme="ezme";
    private String sogan="sogan";
    private String cobanSalata="Coban salata";
    Kaloriler menu= new Kaloriler();

    @Override
    public void hazirla() {
        System.out.println("Salata hazırlanıyor...");
    }

    @Override
    public void servisEt() {
        System.out.println("Salata servis ediliyor...");
    }
    @Override
    public void tuzEkle() {
        System.out.println("Salata tuz ekleniyor...");
    }
    public void getMenu(){
        System.out.println("Salatalar");
        System.out.println("12- "+this.mevsim+" (Kalori degeri= "+menu.getSalataKalori()+")");
        System.out.println("13- "+this.ezme+" (Kalori degeri= "+menu.getSalataKalori()+")");
        System.out.println("14- "+this.sogan+" (Kalori degeri= "+menu.getSalataKalori()+")");
        System.out.println("15- "+this.cobanSalata+" (Kalori degeri= "+menu.getSalataKalori()+")");
        System.out.println("16- salata secimi yapmak istemiyorum");
    }
    public String getMevsim(){
        return mevsim;
    }

    public static void siparisAlindiSalatalar() {
         // Ana sınıfta bulunan siparisAlindi metotunu çağırabilirsiniz
        System.out.println("Siparişiniz alınmıştır ################ (salata)");
    }
}
