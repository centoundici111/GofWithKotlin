package com.patterns.command

//command interface
interface Command {
    fun run()
}

//
class Printer(val message: String) : Command {
    override fun run() {
        println("Printing $message")
    }
}

class Saver(val path: String) : Command {
    override fun run() {
        println("Saving to $path")
    }
}

//executes commands one after the other
class Executor {
    fun execute(commands: List<Command>) {
        commands.forEach {
            it.run()
        }
    }
}

fun main() {
    val commands = listOf(
        Printer("Hello"),
        Saver("/myFile.txt")
    )
    Executor().execute(commands)
}
