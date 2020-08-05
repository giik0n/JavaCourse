package com.panischev.mentoring;

import com.panischev.mentoring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            Application app = context.getBean(Application.class);
            app.execute();

        }
    }
}