package com.nazhiba.kotlinbasic

fun main() {
    val myByte:Byte = 15
    val myShort:Short = 12522
    val myInt:Int = 222984472
    val myLong:Long = 102_2403803_348234024
    val myfloat:Float = 12.12F
    val myDouble:Double = 3.141390090943554
    val myBoolean:Boolean = true
    val myLatterChar = 'A'
    val myDigitChar = '1'
    /*
    TODO: menambahkan kode wibu
    Menambahkan
    */

    var nama = "Joko widodo"
    nama = "Joko widodo"
    var hurufawal = nama[0]
    var hurufakhir = nama[nama.length - 1]
    println("$hurufawal dan $hurufakhir dengan panjang ${nama.length}")
    println("hello dunia")

    // Operasi matematika (+,-,*,/,%)
    val a = 10.00
    val b = 18.00
    var jawaban = 5+3
    jawaban /= 4

    var jawabanDouble:Double?
    jawabanDouble = a / b
    println(jawabanDouble)


    // Comparison Operators (==,!=,<,>,<=,=>)
    val isEqual = 5==5
    println("$isEqual")

    val isNotequal = 5!=5

//    String interpolation
    println("Apakah 5 tidak sama dengan 5 : $isNotequal")
    if (!isNotequal){
        println("Tidak")
    }

    println("Apakah 5 kurang dari 1 = ${5<1}")



//    Assignment operators (+=, -=, *=, /=,%=)
    var myNum = 5
    myNum += 3
    myNum *= 4
    println("myNum is $myNum")




//    Increment & Decrement operators (++,--)
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
}


