package com.Placement.FullStack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Placement.FullStack.model.Client;



public interface ClientRepository extends MongoRepository<Client, String> {}

