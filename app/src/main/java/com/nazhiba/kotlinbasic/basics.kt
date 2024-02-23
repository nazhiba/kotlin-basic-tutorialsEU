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
    println("Penggunaan Assignment operators (+=, -=, *=, /=,%=) line 53 - 57")
    var myNum = 5
    myNum += 3
    myNum *= 4
    println("myNum is $myNum")




//    Increment & Decrement operators (++,--)
    println("Pengunaan Increment & Decrement operators (++,--) line 62 - 76")
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")

    var doni = 170
    var ganjar = 180
    if (doni > ganjar){
        println("tinggi Doni tidak kurang dari ganjar")
    }else if (doni == ganjar){
        println("Tinggi doni sama dengan tinggi ganjar")
    }else {
        println("kodisi lain...")
    }



//    IF, ELSE IF, ELSE
    println("Pengunaan IF, ELSE IF, ELSE line 80 - 92")
    val umur = 19
    if (umur >= 60){
        println("Kenapa gk dari dulu? sebentar lagi AFK dan bertemu lagi di hari kebangkitan")
    }
    if (umur >= 21){
        println("kamu sudah diijinkan untuk membuat kartu tanda tangan")
    }else if (umur >= 18){
        println("Sebentar lagi ya, jaga kesehatan agar tidak mati")
    }else if (umur >= 16){
        println("Belum bisa")
    }else{
        println("Access Blocked!!!")
    }


//    WHEN
    println("Penggunaan WHEN line 96 - 126")
    val musim = 1
    when(musim){
        1 -> println("Musim hujan")
        2 -> println("Musim kemarau")
        3 -> println("Musim musiman")
        4 -> {
            println("Musim Polusi")
            println("Musim Debu")
            println("Musim Sampah")
        }else -> println("Cuma samapai 4")
    }

    val bulan = 3
    when(bulan){
        in 1..2 -> println("Musim hujan")
        in 3..4 -> println("Musim kemarau")
        in 5..6 -> println("Musim musiman")
        in 7..12 -> println("Musim sampahj")
        else -> println("Sejauh ini masih 12 bulan si, tunggu world update tahun 3000")
    }

    var x:Any = false
    when(x){
        is Int -> println("X adalah Integer")
        !is Double -> println("X bukan Double")
        is Float -> println("X adalah Float")
        is Boolean -> println("X adalah Boolean")
        else -> println("bukan apa-apa")

    }

//    WHILE
    println("Pengunaan WHILE line 132 - 138")
    var y = 1
    while (y <= 10){
        print("$y")
        y+=1
    }
    println("WHILE Looping selesai")

//    DO WHILE LOOP
    println("Pengunaan DO WHILE LOOP line 141 - 147")
    y = 1
    do {
        print(y)
        y++
    }while (y <= 10)
    println("DO Looping selesai")

//      FOR LOOP
    println("\nPengunaan FOR LOOP line 168")
    for (i in 1..10){
        print("$i")
    }

    for (im in 1 until 10){
        if (im == 1) print(" | ")
        print("$im")
    }

    for (i in 19 downTo  1){
        if (i == 19) print(" | ")
        print("$i")
    }

    for (i in 19 downTo  1 step 2){
        if (i == 19) print(" | ")
        print("$i")
    }

//    BREAK
    println("\nPengunaan BREAK line 170 - ")
    for (BREAK in 1 until  20){
        print("$BREAK")
        if (BREAK/4 == 2) break
    }


}


