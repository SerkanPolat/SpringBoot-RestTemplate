package com.sp.rc.api.model;

import java.util.List;

public class KisiDTO {
    private Long id;

    private String ad;
    private String soyad;

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

    public String getAdresler() {
        return adresler;
    }

    public void setAdresler(String adresler) {
        this.adresler = adresler;
    }

    private String adresler;
}
