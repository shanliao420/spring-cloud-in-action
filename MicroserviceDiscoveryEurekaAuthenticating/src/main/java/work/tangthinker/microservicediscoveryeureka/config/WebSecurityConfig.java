package work.tangthinker.microservicediscoveryeureka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/11 17:19 星期四
 * @file WebSecurityConfig
 * @project SpringCloud
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf().disable();
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated().and().httpBasic();
        return httpSecurity.build();
    }


}
