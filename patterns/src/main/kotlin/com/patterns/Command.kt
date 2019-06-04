package com.patterns

fun print(message: String) = println("Printing $message")
fun save(message: String) = println("Saving $message")


fun execute(tasks: List<Runnable>){
    tasks.forEach {
        it.run()
    }
}

fun main() {
    val tasks = mutableListOf<Runnable>()
    tasks.add(Runnable { print("thing") })
    tasks.add(Runnable { save("thing") })

    execute(tasks)
}

