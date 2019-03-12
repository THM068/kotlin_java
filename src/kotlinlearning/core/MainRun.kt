package kotlinlearning.core


fun main() {
    val person = Person("Edmund", 42)
    println(run {
        if(person.age == 42)
            person.name
        else
            "string"
    }.toUpperCase())

    person.run {
        name = "Thomas"
    }

    println(person)
}