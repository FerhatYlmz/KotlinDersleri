package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {
    // 1. Sıcaklığı Fahrenheit'a çeviren fonksiyon
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    // 2. Dikdörtgenin çevresini hesaplayan fonksiyon
    fun rectanglePerimeter(length: Int, width: Int): Int {
        return 2 * (length + width)
    }

    // 3. Sayının faktoriyelini hesaplayan fonksiyon
    fun factorial(number: Int): Long {
        var result = 1L
        for (i in 1..number) {
            result *= i
        }
        return result
    }

    // 4. Bir kelimedeki 'a' harfi sayısını bulan fonksiyon
    fun countLetterA(word: String): Int {
        return word.count { it == 'a' || it == 'A' }
    }

}