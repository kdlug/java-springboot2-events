package com.github.kdlug.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CustomEventPublisherTest {
    @Autowired
    CustomEventPublisher publisher;

    @MockBean
    CustomListener listener;

    @Test
    void shouldSentEvent() {
        // when
        publisher.publishEvent("TestEvent");

        // then
        verify(listener, times(1)).onApplicationEvent(any());
    }
}