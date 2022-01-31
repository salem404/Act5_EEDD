
/* ---------------------------------
* Fecha: 31/01/2022
* Versión: 1.1
* Autor: Paula Rumeu Romero
* Empresa/centro: IES Rafael Alberti
* Ejercicio: Kotlin inicial
*----------------------------------- */

//Ejercicio 1
fun notaImpresa(numero:Int) {
    when (numero){
        in 0..4 -> println("Suspenso")
        5 -> println("Suficiente")
        6 -> println("Bien")
        7,8 -> println("Notable")
        9,10 -> println("Sobresaliente")
        else -> println("Valor introducido no correcto")
    }
}

//Ejercicio 2
fun main() {
    notaImpresa(10)
    println()


    val lista = IntArray(20)

    //Se llena y se muestran los números pares
    for (numero in 0..19){
        lista[numero] = (0..100).random()
        if (lista[numero]%2==0){
            println(lista[numero])
        }
    }

    //Lista ordenada
    println()
    val ordenada = lista.sorted()

    //Muestra el último y primer elemento
    println(ordenada.last())
    println(ordenada.first())

    //Suma de elementos
    println()
    println(lista.sum())

    //Añade los elementos pares a una nueva lista
    val listaSinImpares = mutableListOf<Int>()
    for (numero in lista){
        if (numero %2==0){
            listaSinImpares.add(numero)
        }
    }
    println(listaSinImpares)
}