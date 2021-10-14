package io.github.chanhyeong.template.domain

import io.github.chanhyeong.template.config.USER_CREATED_CHANNEL

class UserCreatedEvent(override val eventId: String, val userId: String) : DomainEvent(USER_CREATED_CHANNEL, eventId)
