package pl.pdomaradzki.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by jaizm on 10/06/2017.
 */

@Component
public class CronSimpleTask {

    @Autowired
    ProjectRepository projectRepository;

//    @Scheduled(fixedRate = 1000)

    //s m g d m d
    //* - co każdą
    // / - co ileś
    @Scheduled(cron = "*/10 * * * * *")
    public void  printSomething() {
        System.out.println("HELLOOO!");
    }
}
