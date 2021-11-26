class Pila<out T>(public val lista: List<T>){
    // debería de hacer una conversión de List to ArrayList para poder funcionar el push y pop, pero no he sido capaz
    // se me ocurrió una forma usando algo como esto, pero no he sido capaz de implementarlo a los métodos
    /*
    public fun <T> List<out T>.reversed(): List<T> {
    val list = toMutableList()
    return list
}
     */
    fun get()= lista
    fun push(item: T) = lista.add(item)
    fun pop()= if (lista.isNotEmpty()) lista.removeAt(lista.size) else null
    fun tope()=lista.lastOrNull()
    fun vacia() = lista.count() == 0
}

fun main(args: Array<String>) {
    fun reverse(lista: List<Any>):Pila<Any>{
        var p1= Pila(lista)
        var p2= Pila(lista)
        for (item in p2.get()){
            p2.pop()
        }
        var elemento: String
        if(!p1.vacia()){
            for (item in p1.get()){
                elemento= p1.tope().toString()
                p1.pop()
                p2.push(elemento)

            }
        }
        return p2
    }
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}