package com.meryem.entity;

import java.util.Random;

public class Insan {
    Long id;
    String ad;
    String soyad;
    int yas;
    int cinsiyet;
    boolean asiliMi;
    boolean hastalikTasiyabilirMi;
    boolean hastalikBulastirabilirMi;
    boolean hastaMi;

    public Insan() {
    }

    public Insan(String ad, String soyad, int yas, int cinsiyet, boolean asiliMi,
                 boolean hastalikTasiyabilirMi, boolean hastalikBulastirabilirMi, boolean hastaMi) {
        id = new Random().nextLong(1,9999);
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.asiliMi = asiliMi;
        this.hastalikTasiyabilirMi = hastalikTasiyabilirMi;
        this.hastalikBulastirabilirMi = hastalikBulastirabilirMi;
        this.hastaMi = hastaMi;
    }
    public boolean asiOl(){
        System.out.println("aşı yapıldı");
        this.asiliMi = true;
        return asiliMi;
    }

    public Insan(boolean b) {
    }

    @Override
    public String toString() {
        return "Insan{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                ", asiliMi=" + asiliMi +
                ", hastalikTasiyabilirMi=" + hastalikTasiyabilirMi +
                ", hastalikBulastirabilirMi=" + hastalikBulastirabilirMi +
                ", hastaMi=" + hastaMi +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(int cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public boolean isAsiliMi() {
        return asiliMi;
    }

    public void setAsiliMi(boolean asiliMi) {
        this.asiliMi = asiliMi;
    }

    public boolean isHastalikTasiyabilirMi() {
        return hastalikTasiyabilirMi;
    }

    public void setHastalikTasiyabilirMi(boolean hastalikTasiyabilirMi) {
        this.hastalikTasiyabilirMi = hastalikTasiyabilirMi;
    }

    public boolean isHastalikBulastirabilirMi() {
        return hastalikBulastirabilirMi;
    }

    public void setHastalikBulastirabilirMi(boolean hastalikBulastirabilirMi) {
        this.hastalikBulastirabilirMi = hastalikBulastirabilirMi;
    }

    public boolean isHastaMi() {
        return hastaMi;
    }

    public void setHastaMi(boolean hastaMi) {
        this.hastaMi = hastaMi;
    }
}

