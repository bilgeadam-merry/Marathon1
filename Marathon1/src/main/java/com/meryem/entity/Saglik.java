package com.meryem.entity;

public class Saglik {
    private Insan[] asilananlar;
    private int asilananlarSayisi;

    public Saglik(int kapasite) {
        this.asilananlar = new Insan[kapasite];
        this.asilananlarSayisi = 0;
    }

    public void asilamaYap(Insan... insanlar) {
        for (Insan insan : insanlar) {
            if (insan instanceof NormalInsan && insan.hastalikBulastirabilirMi) {
                if (asilananlarSayisi < asilananlar.length) {
                    this.asilananlar[asilananlarSayisi] = insan;
                    this.asilananlarSayisi++;
                    System.out.println(insan + " aşılandı.");
                } else {
                    System.out.println("Aşılanacak yer kalmadı.");
                }
            } else {
                System.out.println(insan + " aşılanamadı.");
            }
        }
    }

    public Insan[] getAsilananlar() {
        return asilananlar;
    }

    public int getAsilananlarSayisi() {
        return asilananlarSayisi;
    }
}
