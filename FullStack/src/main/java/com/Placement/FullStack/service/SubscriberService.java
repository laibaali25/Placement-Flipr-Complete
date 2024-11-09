package com.Placement.FullStack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Placement.FullStack.model.Subscriber;

@Service
public interface SubscriberService {
  

    List<Subscriber> getAllSubscribers();
    Subscriber saveSubscriber(Subscriber subscriber);
}
