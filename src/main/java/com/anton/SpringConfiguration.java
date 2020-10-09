package com.anton;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.anton")
@PropertySource("classpath:properties")
public class SpringConfiguration {
}
