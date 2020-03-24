package com.github.kdlug.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenGenericEventListener {

    @EventListener
    public void handleSuccessful(GenericEvent<String> event) {
        System.out.println("Received generic conditional event - " + event.getMessage());
    }
}
