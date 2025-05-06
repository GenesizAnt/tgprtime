package ru.genant.tgptime.backend.security;

import com.vaadin.flow.spring.security.VaadinWebSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends VaadinWebSecurity {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers(
                        AntPathRequestMatcher.antMatcher("/"),
                        AntPathRequestMatcher.antMatcher("/register"),
                        AntPathRequestMatcher.antMatcher("/login")
                ).permitAll()
        );

        // Разрешаем доступ к статическим ресурсам
//        http.authorizeHttpRequests(auth -> auth
//                .requestMatchers(
//                        AntPathRequestMatcher.antMatcher("/images/**"),
//                        AntPathRequestMatcher.antMatcher("/line-awesome/**")
//                ).permitAll()
//        );

        // Настраиваем форму входа
        http.formLogin(form -> form
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/", true)
        );

        // Настраиваем выход
        http.logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")
                .permitAll()
        );

        // Разрешаем доступ к Vaadin internals
        super.configure(http);

        // Настраиваем страницу "Доступ запрещен"
        http.exceptionHandling(exception -> exception
                .accessDeniedPage("/access-denied")
        );
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}