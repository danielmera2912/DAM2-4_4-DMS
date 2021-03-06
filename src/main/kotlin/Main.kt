class Pila<T>(var lista: List<T>){

    private val listaMutable = lista.toMutableList()
    fun get()= listaMutable
    fun push(item: T) = listaMutable.add(item)
    fun pop()= if (listaMutable.isNotEmpty()) listaMutable.removeAt(listaMutable.size-1) else null
    fun tope()=listaMutable.lastOrNull()
    fun vacia() = listaMutable.count() == 0

}

fun main(args: Array<String>) {
    fun <T> reverse(lista: List<T>):List<T>{
        var p1= Pila(lista)
        var pc2: List<T> = listOf()
        var p2= Pila(pc2)
        var elemento: T

        if(!p1.vacia()){
            for (item in lista){
                elemento= p1.tope()!!
                p1.pop()
                p2.push(elemento)

            }
        }
        return p2.get()
    }
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}