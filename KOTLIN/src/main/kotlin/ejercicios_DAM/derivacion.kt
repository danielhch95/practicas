package ejercicios_DAM

interface Base {
    fun print ()
}
class BaseImpl (val x: Int) : Base{
    override fun print() { print(x) }
}

class Derived (b: Base) : Base by b

class Derivedsinby (b: Base) : Base {
    private val base: Base = b
    override fun print() {
        base.print()
    }
}

fun derivacion() {

    val a = BaseImpl(10)
    Derived(a).print()

    val b = BaseImpl(10)
    Derivedsinby(b).print()
}