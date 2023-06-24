import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // İsim fonksiyonu, kullanıcının ismini karşılar ve hoş geldin mesajını yazdırır
    public static void isim(String isim) {
        System.out.println("Hoşgeldin " + isim + " bey");
    }

    // Çıkış mesajını yazdıran fonksiyon
    public static void cikisMesaji() {
        System.out.println("Bizi tercih ettiğiniz için teşekkürler");
    }
    public static void hataMesaji() {
        System.out.println("Hatali islem yapildi programdan cikiliyor");
    }
    // Kullanıcıya seçim yapması için uyarı mesajını yazdıran fonksiyon
    public static void uyari() {
        System.out.println("Menüdeki numaralar ile seçim yapınız ###############");
    }

    // Sipariş alındı mesajını yazdıran fonksiyon
    public static void siparisAlindi() {
        System.out.println("Siparişiniz alınmıştır ################");
    }


    // Seçilen ana yemek veya diğer ürünlerin fiyatını hesaplayan fonksiyon
    public static int Hesap(int secim) {
        anaYemekler menu = new anaYemekler();
        fiyatlar menu5 = new fiyatlar();
        int hesap = 0;
        String[] siparisler = new String[3];

        switch (secim) {
            case 1:
                hesap += menu5.getAdanaKebapFiyat();
                siparisler[0] = "Ana yemek: " + menu.getAdanaKebap();
                break;
            case 2:
                hesap += menu5.getLahmacunFiyat();
                siparisler[0] = "Ana yemek: " + menu.getLahmacun();
                break;
            case 3:
                hesap += menu5.getPideFiyat();
                siparisler[0] = "Ana yemek: " + menu.getPide();
                break;
            case 4:
                hesap += menu5.getCigerFiyat();
                siparisler[0] = "Ana yemek: " + menu.getCiger();
                break;
            case 5:
                hesap += menu5.getTavukFiyat();
                siparisler[0] = "Ana yemek: " + menu.getTavuk();
                break;
            case 6:
                hesap += 0;
                siparisler[0] = "Ana yemek seçilmedi";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                hesap += menu5.getCorbaFiyat();
                siparisler[1] = "Çorba";
                break;
            case 11:
                hesap += 0;
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                hesap += menu5.getSalataFiyat();
                siparisler[2] = "Salata";
                break;
            case 16:
                hesap += 0;
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız.");
                break;
        }

        return hesap;
    }

    public static void main(String[] args) {
        anaYemekler yemek4 = new Salatalar();
        anaYemekler yemek5 = new Corbalar();

        System.out.println(anaYemekler.acilis);
        // Kullanıcıdan ismini alarak hoş geldin mesajını yazdırır
        String isim=null;
        Scanner scn4 = new Scanner(System.in);
        System.out.println("İsminiz nedir?");
         isim = scn4.nextLine();
        isim(isim);


        uyari();
        int hesap = 0;
        Scanner scn5 = new Scanner(System.in);
        System.out.println("Siparis cesidini belirtiniz (icecek veya yemek)");
        String secenek = scn5.nextLine();
        if(secenek.equals("yemek")) {
            try { // Ana yemek seçimi yapılır
                anaYemekler menu1 = new anaYemekler();
                menu1.getMenu();
                Scanner scn1 = new Scanner(System.in);
                int secim1 = scn1.nextInt();
                if (secim1 <= 6) {
                   if(secim1!=6) {
                       siparisAlindi();
                       menu1.hazirla(); // Ana yemek hazırlanıyor
                       yemek4.pisir(); // Ana yemek pişiriliyor
                       yemek4.tatlandir(); // Ana yemek servis ediliyor
                       yemek5.tuzEkle();
                       yemek5.servisEt();
                   }
                    // Çorba seçimi yapılır
                    Corbalar menu2 = new Corbalar();
                    menu2.getMenu();
                    Scanner scn2 = new Scanner(System.in);
                    int secim2 = scn2.nextInt();
                    if (secim2 >= 7 && secim2 <= 11) {
                       if(secim2!=11) {
                           siparisAlindi();
                           yemek5.pisir();
                           yemek5.hazirla();
                       }
                        // Salata seçimi yapılır
                        Salatalar menu3 = new Salatalar();
                        menu3.getMenu();
                        Scanner scn3 = new Scanner(System.in);
                        int secim3 = scn3.nextInt();
                        if (secim3 >= 12 && secim3 <= 16) {
                           if(secim3!=16) {
                               yemek4.tuzEkle();
                               yemek4.hazirla();
                               yemek4.servisEt();
                               siparisAlindi();
                           }
                            // Seçilen ürünlerin hesaplaması yapılır
                            hesap = Hesap(secim1) + Hesap(secim2) + Hesap(secim3);

                            System.out.println("Toplam hesap = " + hesap);

                        } else {
                            System.out.println("Hatalı bir salata seçimi yaptınız.");
                        }
                    } else {
                        System.out.println("Hatalı bir çorba seçimi yaptınız.");
                    }
                } else {
                    System.out.println("Hatalı bir ana yemek seçimi yaptınız.");
                }
            } catch (RuntimeException e) {
                System.out.println("Yalnizca yemek kodu girisi yapmalisiniz");
            } finally {
                cikisMesaji();
            }
            // icecek secim bolumu
        }else if(secenek.equals("icecek")){
            Icecekler icecek1= new Icecekler();
            int icecekHesap=0;
            System.out.println("Icecek menumuz###########");
            icecek1.menu();
            Scanner scn6 = new Scanner(System.in);
            System.out.println("Lutfen numaralar ile secim yap");
            int secim1 = scn6.nextInt();
            switch(secim1) {
                case 1:
                    System.out.println("Cola seçiminiz alınmıştır.");
                    icecekHesap += icecek1.colaFiyat;
                    break;
                case 2:
                    System.out.println("Su seçiminiz alınmıştır.");
                    icecekHesap += icecek1.suFiyat;
                    break;
                case 3:
                    System.out.println("Ayran seçiminiz alınmıştır.");
                    icecekHesap += icecek1.ayranFiyat;
                    break;
                case 4:
                    System.out.println("Şalgam seçiminiz alınmıştır.");
                    icecekHesap += icecek1.salgamFiyat;
                    break;
            }

            System.out.println("Toplam hesap: " + icecekHesap);

        }
        else {
            hataMesaji();
        }
    }
    }

