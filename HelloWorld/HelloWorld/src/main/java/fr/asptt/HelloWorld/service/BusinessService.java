package fr.asptt.HelloWorld.service;

import fr.asptt.HelloWorld.model.HelloWorld;
import org.springframework.stereotype.Component;
@Component
public class BusinessService {
    public HelloWorld getHelloworld() {
        HelloWorld hw = new HelloWorld();
        return hw;
    }
}
