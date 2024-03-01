package com.nazhiba.kotlinbasic

fun main() {
    validate(100)
    println("code after validation check...")
}
fun validate(umur:Int){
    if (umur < 18)
        throw ArithmeticException("Under age")
    else{
        println("eligible for drive")
    }
}