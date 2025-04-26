package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 17
    println(yas >= 18)

    if (yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")

        val ka = "admin"
        val s =123456
        val sayi = 10

        if(ka == "admin" && s == 123456){//&& = And(Ve), true && true = true olur, diğerleri false olur
            println("Hoşgeldiniz")

        }else{
            println("Hatalı giriş")
        }

        if (sayi == 9 || sayi == 10){//|| = Or(Veya), false || false = false olur, diğerleri true olur
            println("Sayı 10'dan büyük veya eşittir")
        }else{
            println("Sayı 10'dan küçüktür")
        }

        //When, Diğer dillerde switch
        val number = 5

        when(number) {
            1 -> println("Number is 1")
            2 -> println("Number is 2")
            else -> println("Number is not 1 or 2")
        }
    }

}
