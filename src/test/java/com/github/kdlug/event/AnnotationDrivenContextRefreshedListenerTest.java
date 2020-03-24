package com.github.kdlug.event;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AnnotationDrivenContextRefreshedListenerTest {
    @MockBean
    AnnotationDrivenContextRefreshedListener listener;

    @Test
    void shouldSentContextEvent() {
        // then
        verify(listener, times(1)).handleContextRefresh(any());
    }
}

