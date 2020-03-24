package com.github.kdlug.event;

public class GenericStringEvent extends GenericEvent<String> {
    public GenericStringEvent(String message, boolean success) {
        super(message, success);
    }
}
