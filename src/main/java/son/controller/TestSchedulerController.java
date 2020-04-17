package son.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import son.repository.UserRepository;

@RestController
@EnableAsync
@AllArgsConstructor
@NoArgsConstructor
public class TestSchedulerController implements Condition{

    private UserRepository userRepository;

    /**
     * The fixedDelay property makes sure that there is a delay of n millisecond between
     * the finish time of an execution of a task and the start time of the next execution
     * of the task.
     */
//    @Scheduled(fixedDelay = 1000)
//    public void scheduleFixedDelayTask() {
//        System.out.println(
//                "Fixed delay task - " + System.currentTimeMillis() / 1000);
//    }

    /**
     * The fixedRate property runs the scheduled task at every n millisecond.
     */
//    @Async
    @Scheduled(fixedRate = 5000)
    public void scheduleFixedRateTask() {
//        long taskID = System.currentTimeMillis() / 1000;
//        System.out.println("Fixed rate task - " + taskID);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Task end sleep: " + taskID);
    }
    @Bean
    @Conditional(TestSchedulerController.class)
    ScheduleJob scheduleJob() {
        return new ScheduleJob();
    }

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
//        return userRepository.findByUsername("client") != null;
        return false;
    }
}

class ScheduleJob {
    @Scheduled
    public void scheduleConditionalTask() {
        long taskID = System.currentTimeMillis() / 1000;
        System.out.println("Conditional rate task - " + taskID);
    }
}