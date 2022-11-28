package com.luafanti.debug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DebugApplication

fun main(args: Array<String>) {
    runApplication<DebugApplication>(*args)
}
