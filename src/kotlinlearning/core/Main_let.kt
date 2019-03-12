package kotlinlearning.core


//let is a non-monadic version of map: It accepts objects as parameters and returns the result of the lambda
fun main() {
    val person = Person("Edmund", 42)

    val result = person.let {  it.age * 2 }

    println(person)
    println(result)
}

data class Person(var name: String, var age: Int)