package io.github.chanhyeong.template.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest

@DataJdbcTest
class UserRepositoryTest {
    @Autowired
    lateinit var userRepository: UserRepository

    @Test
    fun findById() {
        assertThat(userRepository.findById("1")).isEmpty
    }
}
