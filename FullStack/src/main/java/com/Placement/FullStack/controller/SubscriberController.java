package com.Placement.FullStack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Placement.FullStack.model.Subscriber;
import com.Placement.FullStack.service.SubscriberService;

import java.util.List;

@RestController
@RequestMapping("/api/subscribers")
public class SubscriberController {
    private final SubscriberService subscriberService;

    @Autowired
    public SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @GetMapping
    public List<Subscriber> getAllSubscribers() {
        return subscriberService.getAllSubscribers();
    }

    @PostMapping
    public Subscriber saveSubscriber(@RequestBody Subscriber subscriber) {
        return subscriberService.saveSubscriber(subscriber);
    }
}
