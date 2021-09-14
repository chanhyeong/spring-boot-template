package io.github.chanhyeong.template.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import io.github.chanhyeong.template.util.logger

@RestController
class HelloController {
    private val logger = logger()

    @GetMapping
    fun hello(): String = "hello"

    @GetMapping("/log")
    fun log(): String {
        logger.error("TEST")
        return "log"
    }
}
