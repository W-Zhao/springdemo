package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:config.properties",encoding = "utf-8")
public class Config {

    @Value("${com.zhao.name}")
    private String name;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }

    @Override
    public String toString() {
        return "Config{" +
                "name='" + name + '\'' +
                ", osName='" + osName + '\'' +
                '}';
    }


}
