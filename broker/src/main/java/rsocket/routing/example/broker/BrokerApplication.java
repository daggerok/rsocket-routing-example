package rsocket.routing.example.broker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

@SpringBootApplication
public class BrokerApplication {

    public static void main(String[] args) {
        Hooks.onOperatorDebug();
        //ResourceLeakDetector.setLevel(ResourceLeakDetector.Level.PARANOID);
        SpringApplication.run(BrokerApplication.class, args);
    }
}

