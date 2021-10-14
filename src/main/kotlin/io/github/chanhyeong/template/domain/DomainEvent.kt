package io.github.chanhyeong.template.domain

import java.time.Instant

abstract class DomainEvent(
    val channel: String,
    open val eventId: String,
    val createdAt: Instant = Instant.now(),
)
