package jti.polinema.ac.id.a04androidrecyclerview;

import java.util.ArrayList;

public class MakananData {
    private static String [] makanan_nama = {
      "Bakso",
            "Gado-Gado",
            "Gorengan",
            "Gudeg",
            "Sop",
            "Soto"
    };
    private static String [] makanan_detail = {
        "Bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka",
                "Gado-gado adalah makanan dengan isian sayur-sayuran. Dicampur dengan bumbu kacang super lezat membuat gado-gado menjadi salah satu makanan berisi sayuran yang paling banyak disukai.",
                "Gorengan adalah makanan yang sudah menjadi bagian dari kehidupan banyak penduduk Indonesia. Apa saja bisa dijadikan gorengan, namun yang umum adalah pisang, tempe, bakwan, ubi dan singkong.",
                "Gudeg merupakan sayur nangka muda yang dimasak dengan gula merah dan santan. Agar lebih lezat, gudeg biasanya dimakan bersama telur rebus, ayam goreng dan beberapa lauk lainnya.",
                "Makanan berisikan sayur-sayuran yang dihidangkan dengan kuah hangat, cocok dimakan saat makan siang bersama sambal serta gorengan hangat",
                "Makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran."
    };
    private static int[] makanan_image = {
        R.drawable.bakso,
        R.drawable.gado2,
        R.drawable.gorengan,
        R.drawable.gudeg,
        R.drawable.sop,
        R.drawable.soto
    };

    static ArrayList<Makanan> getListData(){
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < makanan_nama.length ; position++){
            Makanan makan = new Makanan();
            makan.setNama(makanan_nama[position]);
            makan.setDetail(makanan_detail[position]);
            makan.setPhoto(makanan_image[position]);
            list.add(makan);
        }
        return list;
    };
}
