package com.patterns.command

fun print(message: String) = println("Printing $message")
fun save(path: String) = println("Saving $path")


fun execute(tasks: List<() -> Unit>) {
    tasks.forEach {
        it
    }
}

fun main() {
    val tasks = mutableListOf<() -> Unit>()
    tasks.add { print("Hello") }
    tasks.add { save("/myFile.txt") }

    execute(tasks)
}

