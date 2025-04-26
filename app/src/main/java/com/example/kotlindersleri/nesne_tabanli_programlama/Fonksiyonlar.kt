package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {
    //void - sadece işlem yapan
    //return - işlem yapan ve işlemi sonucu döndüren

    fun selamla1 (){//Swift -> func
        val sonuc = "Merhaba"
        println(sonuc)

    }
    //return - hem işlem yapan hem veri transferi yapan
    fun selamla2() : String {
        val sonuc = "Merhaba"
        return sonuc
    }

    //parametre
    fun selamla3 (isim : String){//Swift -> func
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading - aynı isimde fonksiyonları tekrar kullanmak.
    fun topla(sayi1 : Int, sayi2 : Int){
        println("Toplama : ${sayi1 + sayi2}")
    }

    fun topla(sayi1 : Double, sayi2 : Double){
        println("Toplama : ${sayi1 + sayi2}")
    }

    fun topla(sayi1 : Int, sayi2 : Int, isim: String){
        println("Toplama : ${sayi1 + sayi2} - İşlem yapan : $isim")
    }

}