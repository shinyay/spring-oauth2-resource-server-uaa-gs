package io.pivotal.shinyay.uaa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringOauth2ResourceServerUaaApplication

fun main(args: Array<String>) {
	runApplication<SpringOauth2ResourceServerUaaApplication>(*args)
}
