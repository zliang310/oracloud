package com.oracloud.ora;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by lovis on 2017/10/12.
 */

@ComponentScan(basePackages = {"com.oracloud.ora"})
@EnableAutoConfiguration
@SpringBootApplication
@PropertySource(value = {"classpath:application.properties", "classpath:oracloud.properties"}, ignoreResourceNotFound = true)
//@EnableCaching
@Configuration
@EnableAspectJAutoProxy
@EnableAsync
@Slf4j

public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.setRegisterShutdownHook(true);
        springApplication.run(args);
        log.info("server started......");
    }
}
