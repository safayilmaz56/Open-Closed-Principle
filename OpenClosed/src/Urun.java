public class Urun {
    private String isim;
    private double fiyat;

    public Urun(String isim, double fiyat) {
        setIsim(isim);
        setFiyat(fiyat);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
