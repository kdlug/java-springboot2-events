package com.github.kdlug.event;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class GenericEventListenerTest {
    @Autowired
    GenericEventPublisher publisher;

    @MockBean
    AnnotationDrivenGenericEventListener listener;

    @Captor
    ArgumentCaptor<GenericEvent<String>> eventCaptor = ArgumentCaptor.forClass(GenericStringEvent.class);

    @Test
    void shouldHandleSuccessEvent() {
        // when
        publisher.publishEvent("TestEvent", true);

        // then
        verify(listener, times(1)).handleSuccessful(eventCaptor.capture());
        assertTrue(eventCaptor.getValue().isSuccess());
        assertNotNull(eventCaptor.getValue().getMessage());
    }
}