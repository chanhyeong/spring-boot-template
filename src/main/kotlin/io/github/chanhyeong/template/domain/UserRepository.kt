package io.github.chanhyeong.template.domain

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, String>
