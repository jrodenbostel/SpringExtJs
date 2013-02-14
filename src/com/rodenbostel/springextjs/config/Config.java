package com.rodenbostel.springextjs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created with IntelliJ IDEA.
 * User: justin
 * Date: 2/7/13
 * Time: 8:24 PM
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.rodenbostel.springextjs")
public class Config {
}
