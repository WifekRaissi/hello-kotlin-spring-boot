package com.kotlin.hellokotlinspring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class HelloKotlinSpringApplication

fun main(args: Array<String>) {
    SpringApplication.run(HelloKotlinSpringApplication::class.java, *args)
}
