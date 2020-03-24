package com.github.kdlug.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(final String message) {
        System.out.println("Publishing CustomEvent");
        // creating event object
        CustomEvent customEvent = new CustomEvent(this, message);
        applicationEventPublisher.publishEvent(customEvent);
    }
}
