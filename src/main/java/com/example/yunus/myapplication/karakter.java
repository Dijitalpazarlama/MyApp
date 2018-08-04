package com.example.yunus.myapplication;

public class karakter {
    int kilo;
    int saldiriGucu;
     int hareketSayisi;

    public String yemek(){
        if (hareketSayisi>0){
            kilo++;
            hareketSayisi--;
            return "yemek yedi ve kilo aldı";
        }else{
            return "yeterli hareket yok";
        }
    }

    public String savas(){
        if (hareketSayisi>0){
            hareketSayisi--;
            return "karakter savaştı";
        }else{
            return "yeterli hareket yok";
        }
    }

    public String uyu(){
        if (hareketSayisi>0){
            hareketSayisi--;
            return "karakter uyudu";
        }else{
            return "yeterli hareket yok";
        }
    }

    @Override
    public String toString() {
        return " kilo "+kilo+"\n saldırı gücü"+saldiriGucu+"\n hareket sayısı "+hareketSayisi;
    }
}
