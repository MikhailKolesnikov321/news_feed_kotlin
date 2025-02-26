package net.dunice.advanced.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
private class AdvancedServerApplication

fun main(args: Array<String>) {
	runApplication<AdvancedServerApplication>(*args)
}
