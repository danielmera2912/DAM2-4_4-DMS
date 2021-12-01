class Pila<T>(var lista: List<T>){

    private val listaMutable = lista.toMutableList()
    fun get()= listaMutable
    fun push(item: T) = listaMutable.add(item)
    fun pop()= if (listaMutable.isNotEmpty()) listaMutable.removeAt(listaMutable.size) else null
    fun tope()=listaMutable.lastOrNull()
    fun vacia() = listaMutable.count() == 0
}

fun main(args: Array<String>) {
    fun <T> reverse(lista: List<T>):Pila<T>{
        var p1= Pila(lista)
        var pc2: MutableList<T> = mutableListOf()
        var np2=pc2.toList()
        var p2= Pila(np2)
        var elemento: T
        if(!p1.vacia()){
            for (item in p1.get()){
                elemento= p1.tope()!!
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