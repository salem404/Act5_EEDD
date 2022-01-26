import kotlin.random.Random

/* ---------------------------------
* Fecha: 26/01/2022
* Versión: 1.0
* Autor: Paula Rumeu Romero
* Empresa/centro: IES Rafael Alberti
* Ejercicio: Kotlin inicial
*----------------------------------- */


fun main(args: Array<String>) {
    val lista= IntArray(20)
    
}

//Ejercicio 1
fun notaImpresa(numero:Int) {
    when (numero){
        in 0..5 -> println("Suspenso")
        6 -> println("Bien")
        7,8 -> println("Notable")
        9,10 -> println("Sobresaliente")
        else -> println("Valor introducido no correcto")
    }
}
