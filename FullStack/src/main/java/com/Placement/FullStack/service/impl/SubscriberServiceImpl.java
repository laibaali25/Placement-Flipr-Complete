package com.Placement.FullStack.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Placement.FullStack.model.Subscriber;
import com.Placement.FullStack.repository.SubscriberRepository;
import com.Placement.FullStack.service.SubscriberService;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    private final SubscriberRepository subscriberRepository;

    @Autowired
    public SubscriberServiceImpl(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    @Override
    public List<Subscriber> getAllSubscribers() {
        return subscriberRepository.findAll();
    }

    @Override
    public Subscriber saveSubscriber(Subscriber subscriber) {
        return subscriberRepository.save(subscriber);
    }
}
