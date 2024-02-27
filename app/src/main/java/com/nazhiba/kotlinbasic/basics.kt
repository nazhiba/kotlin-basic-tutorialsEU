package com.nazhiba.kotlinbasic

import android.annotation.SuppressLint
import kotlin.math.floor

@SuppressLint("DefaultLocale")
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
    println("\nPengunaan BREAK line 170 - 176")
    for (BREAK in 1 until  20){
        print("$BREAK")
        if (BREAK/4 == 2) break
    }

//    CONTINUE
    println("\nPengunaan CONTINUE line 178 - 185")
    for (CONTINUE in 1 until  20){

        if (CONTINUE/4 == 2) {
            continue
        }
        print("$CONTINUE")
    }

//  FUNCTION
    println("\nPengunaan FUNCTION line 196 - 198")
    nazhiba()

//  PARAMETER
    println("\nPengunaan PARAMETER line 192")
    var parameter = addon(12,12)
    println(parameter)

//  ARGUMENT
    println("\nPengunaan PARAMETER line 197")
    var ARGUMENT = addUp(5,3)
    println("jawaban adalah ${ARGUMENT}")

//  NULL POINTER EXCEPTION
    println("\nPengunaan NULL POINTER EXCEPTION line 200")
    var name:String? = "Nadzib"
    name = null
    if (name != null){
        println("${name.length}")
    }else{
        null
    }

//  LOWERCASE
    println("\nPengunaan LOWERCOASE line 211")
    nama = "Al-Kwarizmi"
    println(nama?.toLowerCase())

//  UPPERCASE
    println("\nPengunaan UPPERCASE line 215")
    println(nama?.toUpperCase())

//  LET
    println("\nPengunaan LET line 218")
    nama?.let { println(it.length) }

//  ELVIS OPERATOR
    println("\nPengunaan GK TAU NAMANYA APA(kalau gk salah ELVIS OPERATOR) line 221")
    var names = name?:"PING 1.1.1.1"
    println(names)

    names!!.toLowerCase()
    println(names)

//  CLASS AND OBJECT
    println("\nPengunaan CLASS AND OBJECT line 231")
    var nadzib = Person("Nadzib","Hibatulloh",90)
    var anonim = Person()

//  SCOPE
    println("\nPengunaan SCOPE line 236")
    myfunction(5)

//  FUNCTION IN CLASS
    println("\nPengunaan FUNCTION IN CLASS line 239")
    nadzib.hobi = "VALORANT" // MENGANTI HOBI
    nadzib.denganhobi()
    anonim.hobi = "APEX" //MENGANTI HOBI
    anonim.denganhobi()
    nadzib.age = 18 //MENGUBAH UMUR
    println("Suhu ${nadzib.firstName} ini memliki umur ${nadzib.age}")

//  LATEINIT
    println("\nPengunaan LATEINIT IN CLASS line 251")
    var LATEINIT = Mycar()
    LATEINIT.bos

//  SETTERS AND GATTERS
    println("\nPengunaan GATTERS line ")
    var GETTERS = Mycar()
    println("Brand is : ${GETTERS.mybrand}")
    GETTERS.maxspeed = 80
    println("MaxSpeed is : ${GETTERS.maxspeed}")
    println("Model is : ${GETTERS.mymodel}")


//  DATA CLASS
    println("\nPengunaan DATA CLASS line ")
    // ANIS
    val user1 = user(1,"Anis")
                                        //    val nameDataClass = user1.name
                                        //    println(nameDataClass)
    user1.name = "Anies"
    // PRABOWO
    val user2 = user(1,"Prabowo")
    // GANJA
    val user3 = user(1,"Ganjar")
    println(user1 == user2)
    println("User details : $user1")
    println("User details : $user2")
    println("User details : $user3")
    // UPDATE USERS
    val updateusers = user3.copy(name = "AFK") //Update users
    println(user1)
    println(updateusers)
    println(updateusers.component1()) // print 1
    println(updateusers.component2()) // print AFK
    val (id,nameDataClass) = updateusers
    /* |ini sama dengan -.
       |                 |
       |- val id = updateusers.id
       |- val nameDataClass = updateusers.name
    */
    println("id=$id, name=$nameDataClass")


//  STRING LIST
    println("\nPengunaan STRING LIST line ")
    val stringlist:List<String> = listOf("Joko","Ganjar","GG")
    val mixedtypelist:List<Any> = listOf("Joko",21,"Gooolang",2.10)
    for (i in mixedtypelist){
        if (i is Int) println("Integer : $i")
        else if (i is Double) println("Double :$i with floor value ${floor(i)}") //FLOOR membulatkan tipe data Double
        else if (i is String) println("String :$i ${i.length}")
        else println("uknown type")
    }
// ALTERNATIVE
    println("\nALTERNATIVE Pengunaan STRING LIST line")
    for (i in mixedtypelist){
        when(i){
            is Int -> println("Integer : $i")
            is Double -> println("Double :$i with floor value ${floor(i)}")
            is String -> println("String :$i ${i.length}")
            else -> println("uknown type")
        }
    }


//  SMART CAST
    println("\nPengunaan SMART CAST line")
    var SMARTCAST:Any = "I have a dream"
    if (SMARTCAST !is String) println("Bukan String")
    else println("String ditemukan ${SMARTCAST.toUpperCase()}")

//  EXPLICIT (UNSAFE) CASTING USING THE "as" KEYWOARD
    println("\nPengunaan THE \"as\" KEYWOARD line")
    val str1 :String = SMARTCAST as String
    println(str1.length)

    val obj2:Any = 1234
    // val str2:String = obj2 as String
    // println(str2.length)

//  EXPLICIT (UNSAFE) CASTING USING THE "as?" KEYWOARD
    println("\nPengunaan THE \"as?\" KEYWOARD line")
    val obj3:Any = 1234
    val str3:String? = obj3 as? String
    println(str3)

//  INHERINTANCE
    println("\nPengunaan INHERINTANCE line ")
    var mobilku = Car(200.0,"A3","Audi")
    var myEcar = ElectricCar(200.0,"S-model","Tesla",90.0)

//    myEcar.extendRange(200.0)
//    myEcar.drive()
//    myEcar.chargertype = "Type 2"
//    // POLYMORPHISM
//    mobilku.drive(200.00)
//    myEcar.drive(200.00)

    mobilku.brake()
    myEcar.brake()

//  ARRAY
    println("\nPengunaan ARRAY line ")
    val ARRAY:IntArray = intArrayOf(1,2,3,4,5)
    val ARRAYS = intArrayOf(1,2,3,4,5,6)
    val ARRAYS_D:DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
    val ARRAYS_STRING = arrayOf("Senin","Senin","Senin","Senin","Senin","Senin","Ahad")
    println(ARRAYS_STRING.contentToString())
    println(ARRAYS)
    ARRAY[0] = 6 //mengubah array pertama(dalam hal ini berarti 1) menjadi 6
    ARRAY[1] = 6
    println(ARRAY.contentToString())
    println(ARRAYS[0]) //[0] = nilai awal dalam Array di kotlin
    println(ARRAYS.contentToString())
    for (i in ARRAYS){
        print("${i + 5},")
    }
    ARRAYS_D[0] = 6.0


//  Array di dalam data Class
    println("\n\nPengunaan ARRAY di dalam data Class line ")
    val DataClassArray = arrayOf(ARRAY("Monitor",1500.000), ARRAY("KEYBOARD MECHANICAL",800.000))
    println(DataClassArray.contentToString())

    for (i in DataClassArray){
        println("${i.name}")
    }

    for (index in DataClassArray.indices){
        println("${DataClassArray[index].name} is in index ${index}")
    }

    val mix = arrayOf("Sun",1,2,3,4,ARRAY("Apel",25.000))
    println(mix.contentToString())


//  LIST
    println("\nPengunaan LIST line")
    val LIST  = listOf("Januar","Pebruar","Mar")
    val LIST_Any = listOf(1,2,3,4,true,false,"siap siap")
    print(LIST_Any.size)
    print(LIST[1])

    for (month in LIST){
        print(month)
    }

    val additionalBulan = LIST.toMutableList()
    val LIST_BARU = arrayOf("Mei","Juni","Juli")
    additionalBulan.addAll(LIST_BARU)
    additionalBulan.add("April")
    println(additionalBulan)

    val LIST_MUTABLELIST = mutableListOf<String>("Senin","Senin","Senin")
    val removelist = mutableListOf<String>("Kamis","Jumat")
    LIST_MUTABLELIST.add("Minggu")
    LIST_MUTABLELIST[1] = "Selasa"
    LIST_MUTABLELIST.removeAt(2)
    LIST_MUTABLELIST.removeAll(LIST_MUTABLELIST)
    println(LIST_MUTABLELIST)

//  SETS
    println("\nPengunaan SETS line")
    val SETS = setOf("Apel","Anggur","Apel","Samsung")
    println(SETS.size)
    println(SETS.toSortedSet())

    val SETS_NEW = SETS.toMutableSet()
    SETS_NEW.add("Water melon")
    SETS_NEW.add("Pare")
    println(SETS_NEW.elementAt(4))

//  MAPS
    println("\nPengunaan MAPS line")
    val MAPS = mapOf(1 to "Monday",2 to "Selasa", 3 to "Rabu")
    println(MAPS[2])
    for (key in MAPS.keys){
        println("$key is to ${MAPS[key]}")
    }
    val MAPSS = mapOf("favorite" to MAPS("Telo",12.000),
        "!favorite" to MAPS("Telo mentah",12.000))
    val newdayofweek = MAPS.toMutableMap()
    newdayofweek[0] = "Friday"
    println(newdayofweek.toSortedMap())

//  LAMBDA EKSPRESSION


}
// =================== INTERFACE ======================
interface Drivable{
    val maxspeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is breaking")
    }
}
//======================= INHERINTANCE =================
// SUPER CLASS, PARENT CLASS, BASE CLASS
open class vehicle{
    // properties
    // methods
}


// SUB CLASS CHILD CLASS OR DERIVED CLASS OF VEHICLE
// SUPER CLASS, PARENT CLASS, BASE CLASS OF VEHICLE
open class Car(override val maxspeed: Double, namel: String, val brand: String):Drivable{
    open var range:Double = 0.0
    fun extendRange(amount:Double){
        if (amount > 0){
            range+=amount
        }
    }

    override fun drive(): String {
        return "driving the interface drive"
    }
    open fun drive(jarak: Double){
        println("Drove for $jarak KM")
    }
}


// SUB CLASS CHILD CLASS OR DERIVED CLASS OF CAR
class ElectricCar(maxspeed: Double,namel: String, brand: String, battryLife: Double)
    : Car(maxspeed, namel, brand){
    override var range = battryLife * 6
    var chargertype = "Type1"
    override fun drive(distance:Double){
        println("Drove for $distance KM on electtriciy")
        }
    override fun drive():String{
        return "Drove for $range KM on electricty"
        }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
    }



//======================= DATA CLASSES =================
data class MAPS(val nama:String, val harga:Double)
data class ARRAY(val name:String, val harga:Double)
data class user(val id:Long, var name:String)

//======================= CLASS ========================
class Mycar(){
    lateinit var bos:String

    // GETTERS
    val mybrand:String = "BMW"
        get() {
            return field.toLowerCase()
        }

    // SETTERS
    var maxspeed:Int = 250
        // get() = field
        set(value) {
            field = if (value>0) value else throw IllegalArgumentException("Max speed gk mungkin 0 lahh")
        }

    var mymodel:String = "UEFI"
        private set

    init {
        this.mymodel = "UEFI"
        this.bos = "Ganjart"
        println(bos)
    }
}

class Person(firstName:String = "Anonim", lastName:String = "No input"){

    //  MEMBER VARIABEL - PROPERTIES
    var age:Int? = null
    var hobi:String = "BERNAFAS MANUAL"
    var firstName:String? = null // AGAR DAPAT DI PRINT DI LINE 248

    // INITIALIZER
    init {
        this.firstName = firstName
        println("Person created dengan Nama depan = {$firstName} dan Nama akhir {$lastName}")
    }

    //  MEMBER FUNCTION - METHODS
    fun denganhobi(){
        println("$firstName\'s Hobiku adalah $hobi")
    }

    // MEMBER SECONDARY CONSTRUCTOR
    constructor(firstName: String, lastName: String, age:Int)
            : this(firstName, lastName){
                this.age = age
                println("initilized a Person object withNama awal = $firstName dan nama akhir = $lastName demgam umur $age")
            }

}

//======================= FUNCTION ==============================
fun myfunction(a:Int){ // disini a adalah sebuah parameter bukan variabel

    // disini a adalah varibel
    var a = a
    println(a)
}

fun nazhiba(){
    println("called from my function")
}

fun addon(a:Int, b:Int):Int{
    return a + b
}

fun addUp(a:Int, b:Int):Int{
    return a + b
}

fun avg(a:Double, b:Double):Double{
    return (a+b)/2
}





