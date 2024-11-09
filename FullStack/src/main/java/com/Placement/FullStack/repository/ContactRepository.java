package com.Placement.FullStack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Placement.FullStack.model.Contact;

public interface ContactRepository extends MongoRepository<Contact, String> {}
