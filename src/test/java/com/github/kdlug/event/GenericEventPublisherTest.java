package com.github.kdlug.event;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class GenericEventPublisherTest {
    @InjectMocks
    GenericEventPublisher publisher;

    @Mock
    ApplicationEventPublisher applicationEventPublisher;

    @Captor
    ArgumentCaptor event;

    @Test
    void shouldSentSuccessEvent() {
        // when
        publisher.publishEvent("TestEvent", true);

        // then
        verify(applicationEventPublisher, times(1)).publishEvent(event.capture());
    }

    @Test
    void shouldSentFailEvent() {
        // when
        publisher.publishEvent("TestEvent", false);

        // then
        verify(applicationEventPublisher, times(1)).publishEvent(event.capture());
    }
}