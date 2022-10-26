public class Main {
    public static void main(String[] args) {
        Odeme odeme = new Odeme();
        Urun ceptelefonu = new Urun("ceptelefonu",9000);
        Urun bilgisyar = new Urun("bilgisyar",15000);
        Sepet sepet = new Sepet();
        StandartUyelik standartUyelik = new StandartUyelik();
        PremiumUyelik premiumUyelik = new PremiumUyelik();
        OzelUyelik ozelUyelik = new OzelUyelik();
        Kullanici kullanici = new Kullanici();

        kullanici.setIsim("Safa Yılmaz");
        kullanici.setMail("muhammedsafayilmaz56@gmail.com");
        kullanici.setSifre("123456");
        kullanici.setTip(ozelUyelik);

        sepet.urunEkle(ceptelefonu);
        sepet.urunEkle(bilgisyar);

        System.out.println("Sepet fiyatınız:" + odeme.fiyatHesapla(kullanici,sepet));
    }
}