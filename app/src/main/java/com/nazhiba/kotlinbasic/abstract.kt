package com.nazhiba.kotlinbasic
abstract class Mammal(private val name:String, private val origin:String, private val weight:Double){

    // Abstract property (Must be overidden by Subclasses)
    abstract var maxSpeed:Double

    abstract fun run()
    abstract fun breath()

    //Concrate non Abstract method
    fun displayDetails(){
        println("Nama:${name}, Origin:${origin}, Weight:${weight}, maxspeed: ${maxSpeed}")
    }
}

class human(name: String, origin: String, weight: Double, override var maxSpeed: Double):Mammal(name,origin, weight){
    override fun run() {
        println("Berjalan dengan dua kaki")
    }

    override fun breath() {
        println("Bernafas memlalui hidung dan mulut")
    }
}

class gajah(name: String, origin: String, weight: Double, override var maxSpeed: Double):Mammal(name,origin, weight){
    override fun run() {
        println("Berjalan dengan 4 kaki")
    }

    override fun breath() {
        println("Bernafas melalui trunk")
    }
}


fun main() {
    val human = human("Joko","China",60.0,30.0)
    val gajah = gajah("Joy","Jawa",5400.0,20.0)

    human.run()
    gajah.run()

    human.breath()
    gajah.breath()
}