package src.main.kotlin.one.digitalinnovation.collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id:String ,value: T){
        map[id] = value
    }

    fun remove(id: String) = map.remove(id)

    fun findViewId(id: String) = map[id]

    fun findAll() = map.values
}