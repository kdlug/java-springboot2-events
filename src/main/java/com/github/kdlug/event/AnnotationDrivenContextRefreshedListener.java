package com.github.kdlug.event;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenContextRefreshedListener {
    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent even) {
        System.out.println("Received annotation driven context refreshed event");
    }
}
