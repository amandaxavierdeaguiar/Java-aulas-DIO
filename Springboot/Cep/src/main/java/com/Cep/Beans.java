package com.Cep;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    /**
     * @return
     */
    @Bean
    public Gson gson(){
        return new Gson();
    }
}