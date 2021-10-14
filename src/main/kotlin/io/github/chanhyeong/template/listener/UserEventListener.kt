package io.github.chanhyeong.template.listener

import io.github.chanhyeong.template.config.CustomEventListener
import io.github.chanhyeong.template.domain.UserCreatedEvent
import io.github.chanhyeong.template.util.logger

@CustomEventListener
class UserEventListener {
    private val logger = logger()

    fun userCreated(userCreatedEvent: UserCreatedEvent) {
        logger.info("user created: ${userCreatedEvent.userId}")
    }
}
