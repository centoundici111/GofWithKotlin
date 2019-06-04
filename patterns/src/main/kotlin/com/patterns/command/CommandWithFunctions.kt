package com.patterns.command

fun print(message: String) = println("Printing $message")
fun save(path: String) = println("Saving $path")


fun execute(tasks: List<Runnable>){
    tasks.forEach {
        it.run()
    }
}

fun main() {
    val tasks = mutableListOf<Runnable>()
    tasks.add(Runnable { print("Hello") })
    tasks.add(Runnable { save("/myFile.txt") })

    execute(tasks)
}

