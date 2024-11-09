package com.Placement.FullStack.service;

import java.util.List;

import com.Placement.FullStack.model.Project;

public interface ProjectService {

   Project getProjectById(String id);

    List<Project> getAllProjects();
    Project saveProject(Project project);
}
