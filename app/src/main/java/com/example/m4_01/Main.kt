package com.example.m4_01

import android.net.IpPrefix
import android.webkit.ConsoleMessage

fun main() {

// Ejercicio 1
    var mutable = 30
    val inmutable = "Casa"
    val numimut = 65.45

    println("$mutable $inmutable $numimut")

    val numberDouble = 3.555433568945237958937634283462894362342436298362
    println(numberDouble)


// Ejercicio 2
    val valorChar = 'W'
    val cadenadedatosString = "Prueba de texto largo para ver cómo se comporta"
    val floatFloat = 43453435.5464534535354
    println("$valorChar $cadenadedatosString $floatFloat")

// Ejercicio 3
    var aaa = 10
    var bbb = 33
    var ccc = 66
    var ddd = 0
    ddd = aaa + bbb + ccc
    println(ddd)
    aaa = 55
    ddd = aaa + bbb + ccc
    println(ddd)
    var eee = ddd/3
    println(eee)

    imprimirNombreApellidoEdad("Juan José","Molina", 48)
    imprimirNombreApellidoEdad("Andrés","Molina", 17)
    imprimirNombreApellidoEdad("Martín","Molina", 19)
    imprimirNombreApellidoEdad("Irina","Molina", 9)

    val mensaje = "Esta es una prueba"
    printMessage(mensaje)

    printMessageWithPrefix("Juan José Molina León")
}

fun getNombreCompleto():String{
    return "Juan José Molina León"
}

fun getEdad():Int{
    return 48
}

fun imprimirNombreApellidoEdad(nombre:String, apellido:String, edad:Int){
    println("Mi nombre es $nombre $apellido y tengo $edad años")
}

fun printMessage(message: String):Unit{
    println(message)
}

fun printMessageWithPrefix(nombreEstud: String, prefix: String = "Estudiante :"){
    println("$prefix $nombreEstud")

}