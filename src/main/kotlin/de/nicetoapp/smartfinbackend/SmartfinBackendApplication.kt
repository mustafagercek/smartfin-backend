package de.nicetoapp.smartfinbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SmartfinBackendApplication

fun main(args: Array<String>) {
	runApplication<SmartfinBackendApplication>(*args)
}

@RestController
class GreeterController {
    @GetMapping("/greeting")
    fun greeting() = ResponseEntity.ok("Hello")
}
