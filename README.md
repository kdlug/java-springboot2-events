# Using Events in Spring

Event publishing is one of the capabilities provided by ApplicationContext. 

Needed objects:
- Application event - a placeholder to store the event data
- Event publisher -  constructs the event object and publishes it to listeners
- Listener - an object which listen to the event
 
Guidelines to follow:
 
- the event should extend ApplicationEvent
- the publisher should inject an ApplicationEventPublisher object
- the listener should be bean and implement the ApplicationListener interface;  custom listener is parametrized with the generic type of custom event which makes the onApplicationEvent() method type safe. 
 
By default custom events are synchronous.


Starting with Spring 4.2, an event listener is not required to be a bean implementing the ApplicationListener interface – it can be registered on any public method of a managed bean via the @EventListener annotation.
This listener is invoked synchronously. To make it asynchronous we need to add `@Async` annotation (do not forget to enable Async support in the application).

Enabling Async support

```
@Configuration
@EnableAsync
public class AsyncConfig {
   
}
```
