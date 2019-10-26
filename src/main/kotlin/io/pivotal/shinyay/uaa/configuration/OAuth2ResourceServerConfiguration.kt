package io.pivotal.shinyay.uaa.configuration

import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableWebSecurity
class OAuth2ResourceServerConfiguration : WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        http?.authorizeRequests()
                ?.antMatchers("/read/**")?.hasAuthority("SCOPE_resource.read")
                ?.antMatchers("/write/**")?.hasAuthority("SCOPE_resource.write")
                ?.anyRequest()
                ?.authenticated()
                ?.and()
                ?.oauth2ResourceServer()
                ?.jwt()
    }
}