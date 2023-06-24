public class anaYemekler {
    private String adanaKebap = " adana kebap";
    private String lahmacun = " lahmacun";
    private String pide = " pide";
    private String ciger = " ciger";
    private String tavuk = " tavuk";
    static String acilis="2023ten beri ...";

    private Kaloriler menu = new Kaloriler();

    public void hazirla() {
        System.out.println("Ana yemek hazırlanıyor...");
    }

    public void pisir() {
        System.out.println("Ana yemek pişiriliyor...");
    }

    public void servisEt() {
        System.out.println("Ana yemek servis ediliyor...");
    }

    public void tatlandir() {
        System.out.println("Ana yemek tatlandırılıyor...");
    }

    public void tuzEkle() {
        System.out.println("Ana yemeğe tuz ekleniyor...");
    }
    public void getMenu() {
        System.out.println("Kebaplar###########");
        System.out.println("1- " + this.adanaKebap + " (Kalori degeri= " + menu.getAdanaKebapKalori() + ")");
        System.out.println("2- " + this.lahmacun + " (Kalori degeri= " + menu.getLahmacunKalori() + ")");
        System.out.println("3- " + this.pide + " (Kalori degeri= " + menu.getPideKalori() + ")");
        System.out.println("4- " + this.ciger + " (Kalori degeri = " + menu.getCigerKalori() + ")");
        System.out.println("5- " + this.tavuk + " (Kalori degeri = " + menu.getTavukKalori() + ")");
        System.out.println("6- Yemek secimi yapmak istemiyorum");
    }

    public String getAdanaKebap() {
        return adanaKebap;
    }

    public String getLahmacun() {
        return lahmacun;
    }

    public String getPide() {
        return pide;
    }

    public String getCiger() {
        return ciger;
    }

    public String getTavuk() {
        return tavuk;
    }

    public static void siparisAlindi() {
        System.out.println("Siparişiniz alınmıştır ################");
    }
}