package io.github.chanhyeong.template.controller

import java.util.* // ktlint-disable no-wildcard-imports
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import io.github.chanhyeong.template.domain.UserCreatedEvent
import io.github.chanhyeong.template.util.EventPublisher
import io.github.chanhyeong.template.util.logger

@RestController
class HelloController(
    private val eventPublisher: EventPublisher
) {
    private val logger = logger()

    @GetMapping
    fun hello(): String = "hello"

    @GetMapping("/log")
    fun log(): String {
        logger.error("TEST")
        return "log"
    }

    @GetMapping("/publish")
    fun publish() {
        eventPublisher.publish(UserCreatedEvent(UUID.randomUUID().toString(), "chanhyeong-cho"))
    }
}
