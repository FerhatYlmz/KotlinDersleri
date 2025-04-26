package com.example.kotlindersleri.nesne_tabanli_programlama

data class Yemekler (var id: Int, var ad: String, var fiyat: Int){
    //Constructor - init fonksiyonu
    //Bu sınıftan nesne oluşturulduğunda çalışacak fonksiyon
    init {
        println("Yemekler sınıfından nesne oluşturuldu.")
    }

    fun bilgiAl(){
        println("--------------")
        println("Id: $id")
        println("Ad: $ad")
        println("Fiyat: $fiyat")
    }
    //this : Bulunduğu sınıfı temsil eder.Swift de self gibi.
    //super : Kaıtım ile bir üst sınıfı temsil eder.

}