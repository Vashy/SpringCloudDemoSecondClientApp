package it.vashykator.spring.cloud.app.second

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecondClientAppApplication

fun main(args: Array<String>) {
	runApplication<SecondClientAppApplication>(*args)
}
