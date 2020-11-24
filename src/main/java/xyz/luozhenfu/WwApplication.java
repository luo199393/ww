package xyz.luozhenfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WwApplication {

    public static void main(String[] args) {
        System.out.println(SpringApplication.run(WwApplication.class,args));
    }
}
