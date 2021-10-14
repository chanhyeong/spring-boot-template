package io.github.chanhyeong.template.controller

import io.restassured.module.mockmvc.kotlin.extensions.Extract
import io.restassured.module.mockmvc.kotlin.extensions.Given
import io.restassured.module.mockmvc.kotlin.extensions.Then
import io.restassured.module.mockmvc.kotlin.extensions.When
import org.assertj.core.api.Assertions.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import io.github.chanhyeong.template.util.EventPublisher

@ExtendWith(MockitoExtension::class)
class HelloControllerTest {

    @Mock
    lateinit var eventPublisher: EventPublisher

    @Test
    fun example() {
        val id: String =
            Given {
                standaloneSetup(HelloController(eventPublisher))
                // param("name", "Johan")
            } When {
                get("/")
            } Then {
                body(
                    `is`("hello"),
                )
            } Extract {
                asString()
            }

        assertThat(id).isEqualTo("hello")
    }
}
