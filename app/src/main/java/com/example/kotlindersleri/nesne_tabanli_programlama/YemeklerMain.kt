package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val y1 = Yemekler( 100, "Kofte", 249)
    //Değer Okuma
    y1.bilgiAl()

    y1.fiyat = 350
    y1.bilgiAl()


    val y2 = Yemekler(101,"Tavuk Sote",250)
    y2.bilgiAl()
    y2.ad = "Sote"
    y2.bilgiAl()

}