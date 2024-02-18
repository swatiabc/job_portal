package com.portal.job.users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig{

    @Bean
    CommandLineRunner commandLineRunner(
            UserRepository userRepository
    ) {
        return args -> {
            User swati_user = new User(
                    "swati",
                    "pandey",
                    "+919082586565",
                    "swati@gmail.com",
                    13L,
                    20L,
                    "software developer",
                    "payu finance"
            );
            User shivam_user = new User(
                    "shivam",
                    "pandey",
                    "+919082586565",
                    "shivam@gmail.com",
                    13L,
                    20L,
                    "software developer",
                    "payu finance"
            );

            userRepository.saveAll(List.of(swati_user, shivam_user));
        };
    }
}
