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

    println(suma(20,30))

    printAll("Mensaje 1","Mensaje 2","Mensaje 3")

    printWithTextPrefix("Hola", "Hallo",prefix = "Saludos")

    val denominacion = "Juan"
    denominacion.saludo()
    denominacion.despedida()
    denominacion.saludos()
    denominacion.despedidas()
    "Imprime lo que pongas acá, por estar llamando al método 'imprimir'".imprimir() // el 'this' mágico

    var customer = Customer()
    var contact = Contact(10, "molinaleon@gmail.com")
    println("${contact.id} ${contact.e_mail}")
    println(contact.id)
    println(contact.e_mail)










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

fun suma(x: Int, y: Int):Int{
    return x+y
}

fun printAll(vararg message: String){
    for(parametros in message) println(parametros)
}

fun printWithTextPrefix(vararg message: String, prefix: String){
    for (elemento in message) println("$prefix $elemento")
}

fun String.saludo(){
    println("Hola")
}

fun String.despedida(){
    println("Adios")
}

fun String.saludos(){
    println("$this Hola") // el "this" lo que hace es aplicar lo que hay antes del método,
    // que en este caso es "denominacion", por eso imprime el nombre metido en la variable.
}

fun String.despedidas(){
    println("$this Adios")
}

fun String.imprimir(){
    println(this)
}

class NewClass

class Person(mText: String)

class Customer

class Contact(val id: Int, var e_mail: String)
