package com.Placement.FullStack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Placement.FullStack.model.Project;

public interface ProjectRepository extends MongoRepository<Project, String> {}
