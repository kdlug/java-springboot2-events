package com.github.kdlug.event;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenContextRefreshedListener {
    @Async
    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent even) {
        System.out.println("Received annotation driven context refreshed event");
    }
}
