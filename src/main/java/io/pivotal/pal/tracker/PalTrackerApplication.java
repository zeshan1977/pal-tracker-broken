package io.pivotal.pal.tracker;
<<<<<<< HEAD
=======

>>>>>>> lab4-sol
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PalTrackerApplication {
<<<<<<< HEAD
    @Bean
    public TimeEntryRepository timeEntryRepository() {
        return new InMemoryTimeEntryRepository();
    }

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
=======

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
        }

    @Bean
    TimeEntryRepository timeEntryRepository() {
        return new InMemoryTimeEntryRepository();
>>>>>>> lab4-sol
    }
}
