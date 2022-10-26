public class Odeme {
    public double fiyatHesapla(Kullanici kullanici,Sepet sepet){
        return kullanici.getTip().indirimliTutar(sepet.fiyat(),sepet.urunAdet());
    }
}
