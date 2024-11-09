package com.Placement.FullStack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Placement.FullStack.model.Subscriber;

public interface SubscriberRepository extends MongoRepository<Subscriber, String> {}
