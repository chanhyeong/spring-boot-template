package io.github.chanhyeong.template.domain

import javax.validation.constraints.Size
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Persistent

@Persistent
data class User(
    @Id
    @Size(max = 10)
    val userId: String,

    @Size(max = 100)
    val password: String,
)
