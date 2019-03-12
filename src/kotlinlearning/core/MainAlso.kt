package kotlinlearning.core

import java.io.File

//With this function, you say “also do this with the object.” I often use it to add debugging to the call chains or to do some additional processing:
fun main() {
    val person = Person("Edmund", 43)

    val result = person.run { this.name = "Thomas"
                 this}.also { p -> println("My age is ${p.name}") }

    println(person)
    println(result)

    val p1 = Person("Kerrie", 32)

    p1.also {
        it.name = "Thomas -->"
    }.also {
        it.age = 37
    }.also {
        println(it)
    }

    val original = "abc"

    original.also {
        println("The original String $it")
        it.reversed()
    }.also {
        println("The reversed String $it")
        it.length
    }.also {
        println("The length of the String is ${it}")
    }

    val path = "/Users/tma24/Workspace/learning/src/resources"

    makeDir(path)

}

fun makeDir(path: String): File = path.let { File(it)}.also {
    println("creating directories")
    it.mkdir()
}
