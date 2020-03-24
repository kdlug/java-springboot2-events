package com.github.kdlug.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GenericEventPublisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(final String message, final boolean success) {
        System.out.println("Publishing Generic Event");
        // creating event object
        GenericEvent<String> genericEvent = new GenericStringEvent(message, success);
        applicationEventPublisher.publishEvent(genericEvent);
    }
}
