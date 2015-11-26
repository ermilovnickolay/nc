package com.netcracker.football.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ComponentScan(scopedProxy = ScopedProxyMode.INTERFACES, basePackages = { "com.netcracker.football" })
public class ApplicationConfigurator {

}
