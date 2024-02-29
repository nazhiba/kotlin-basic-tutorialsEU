package com.nazhiba.kotlinbasic

open class BASI(){
    var a = 1 // public by default
    private var b = 2 // private to BASI class
    protected open val c = 3 // visible to the BASI and the DELIVERED class
    internal val d = 4 // visible inside the same module
    protected fun e() {} // visible to the Base and the Delivered class

}

class DELIP:BASI(){
    // a,c,d and e() of the Base class are visible
    // b is not visible
    override val c = 9 // c is protected
}

fun main() {
    val bang = BASI()
    // BASI.a and BASI.d are visible
    // BASI.b and BASI.c BASI.e{} are not visible

    val derived = DELIP()
    // derived.c is not visible
}

