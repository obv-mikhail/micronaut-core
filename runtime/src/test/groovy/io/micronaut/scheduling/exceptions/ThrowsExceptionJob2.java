package io.micronaut.scheduling.exceptions;

import io.micronaut.context.annotation.Requires;
import io.micronaut.core.reflect.exception.InstantiationException;
import io.micronaut.scheduling.annotation.Scheduled;

import javax.inject.Singleton;

@Singleton
@Requires(property = "scheduled-exception1.task2.enabled", value = "true")
public class ThrowsExceptionJob2 {
    @Scheduled(fixedRate = "10ms")
    public void runSomething() {
        throw new InstantiationException("bad things");
    }

}
