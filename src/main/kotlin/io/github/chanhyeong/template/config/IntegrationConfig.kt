package io.github.chanhyeong.template.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.integration.dsl.integrationFlow
import io.github.chanhyeong.template.domain.UserCreatedEvent
import io.github.chanhyeong.template.listener.UserEventListener

@Configuration
class IntegrationConfig {

    @Bean
    fun userCreatedFlow(userEventListener: UserEventListener) = integrationFlow {
        channel { publishSubscribe(USER_CREATED_CHANNEL) }
        handle<UserCreatedEvent> { event, _ ->
            userEventListener.userCreated(event)
        }
    }
}
