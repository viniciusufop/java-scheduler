package br.com.vfs.javascheduler.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
@EnableScheduling
public class SchedulingTask {

    private static final long SECOND = 1000;
    @Scheduled(fixedDelay = SECOND)
    public void scheduleFutureTask() {
        log.info("Schedule execution in: {}", LocalDateTime.now());
    }
}
