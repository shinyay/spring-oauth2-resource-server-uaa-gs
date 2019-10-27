package io.pivotal.shinyay.uaa.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.jwt.Jwt
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class OAuth2ResourceServerRestController {

    @GetMapping("/")
    fun index(@AuthenticationPrincipal jwt: Jwt) = "Hello, ${jwt.subject}"

    @GetMapping("/read")
    fun read(principal: Principal) = "Hello read: ${principal.name}"

    @GetMapping("/write")
    fun write(principal: Principal) = "Hello write: ${principal.name}"
}