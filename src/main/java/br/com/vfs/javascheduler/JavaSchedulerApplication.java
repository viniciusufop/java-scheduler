package br.com.vfs.javascheduler;

import br.com.vfs.javascheduler.scheduler.SchedulingTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSchedulerApplication.class, args);
		SchedulingTask scheduling = new SchedulingTask();
		scheduling.scheduleFutureTask();
	}

}
