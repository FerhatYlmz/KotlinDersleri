package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    //void = unit
    f.selamla1()

    //return
    val gelenmesaj = f.selamla2()
    println("Gelen Mesaj : $gelenmesaj")


    //parametre
    f.selamla3( "Zeynep")


    f.topla(10,20,"Beyza")

}