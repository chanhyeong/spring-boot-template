package io.github.chanhyeong.template.util

import org.springframework.context.ApplicationContext
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.support.GenericMessage
import org.springframework.stereotype.Component
import io.github.chanhyeong.template.domain.DomainEvent

@Component
class EventPublisher(private val applicationContext: ApplicationContext) {
    private val logger = logger()

    fun <T : DomainEvent> publish(domainEvent: T) {
        val channel = applicationContext.getBean(domainEvent.channel) as MessageChannel

        logger.info("publish ${domainEvent.eventId}")

        channel.send(GenericMessage(domainEvent))
    }
}
