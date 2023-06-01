package com.observer.observer.config;


import com.observer.observer.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean
    public User user1() {
        return new User("Gio");
    }
    @Bean
    public User user2() {
        return new User("Vato");
    }
    @Bean
    public User user3() {
        return new User("Dima");
    }


}
