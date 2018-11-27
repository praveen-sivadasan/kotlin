package com.sample.spring.kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class GreetingController {

	@GetMapping("/kotlin/hello")
	fun helloKotlin(): String {
		return "Kotlin says hello"
	}
}
