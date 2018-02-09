package com.lazytitan.config;

import org.springframework.boot.autoconfigure.velocity.VelocityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

/**
 * @author liubojin on 2018/2/9 15:20
 */
public class VelocityConfig {

    @Bean(name = "velocityViewResolver")
    public VelocityLayoutViewResolver velocityViewResolver(VelocityProperties properties) {
        VelocityLayoutViewResolver resolver = new VelocityLayoutViewResolver();

        properties.applyToViewResolver(resolver);
        resolver.setLayoutKey("default-layout");
        resolver.setLayoutUrl("layout/default.vm");
        resolver.setContentType("text/html;charset=UTF-8");
        return resolver;
    }
}
