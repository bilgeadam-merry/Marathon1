package com.meryem;

import com.meryem.entity.Insan;
import com.meryem.entity.NormalInsan;
import com.meryem.entity.Saglik;

public class Runner {
    public static void main(String[] args) {

            Insan insan1 = new NormalInsan("ayşe", "taşçı",43, "kadın",false,true,true,false);
            Insan insan2 = new Insan(false); // Hastalık bulaşmayan bir insan
            Insan insan3 = new NormalInsan("mustafa","gürsoy",32,"erkek",true, false, true,false);

            Saglik saglikSinifi = new Saglik(5); // 5 kişilik aşılanacak yer
            saglikSinifi.asilamaYap(insan1, insan2, insan3);

            Insan[] asilananlarDizisi = saglikSinifi.getAsilananlar();
            System.out.println("Aşılanan insanlar:");
            for (Insan insan : asilananlarDizisi) {
                if (insan != null) {
                    System.out.println(insan);
                }
            }
            System.out.println("Toplam aşılanan insan sayısı: " + saglikSinifi.getAsilananlarSayisi());
            System.out.println(asilananlarDizisi.toString());

    }
}
