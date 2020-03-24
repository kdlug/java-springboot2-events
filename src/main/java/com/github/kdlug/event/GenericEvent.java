package com.github.kdlug.event;

public class GenericEvent<T> {
    private T message;
    protected boolean success;

    public GenericEvent(T message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public T getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }
}

