package io.github.chanhyeong.template

import io.restassured.module.mockmvc.kotlin.extensions.Extract
import io.restassured.module.mockmvc.kotlin.extensions.Given
import io.restassured.module.mockmvc.kotlin.extensions.Then
import io.restassured.module.mockmvc.kotlin.extensions.When
import org.assertj.core.api.Assertions.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import io.github.chanhyeong.template.controller.HelloController

class HelloControllerTest {

    @Test
    fun example() {
        val id: String =
            Given {
                standaloneSetup(HelloController())
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
