package com.company.chatbot.factory.controller;

import com.company.chatbot.factory.service.PaymentProcessor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController()
@NoArgsConstructor
@RequestMapping("/factory")
@Slf4j
public class FactoryController {

    @Autowired
    private Map<String, PaymentProcessor> factory;// = new HashMap<>();

    /*@Autowired
    public FactoryController(Map<String, PaymentProcessor> factory) {
        System.out.println("FactoryController");
        this.factory = factory;
    }*/

    @GetMapping("/pay")
    public String getPaymentType(@RequestParam("type") String type) {
        log.info("=>>>>>>>>>>>>>>>> factory =>>>>>>>>>>> {}", factory);
        return factory.get(type).getPaymentType();
    }
}
