package com.Placement.FullStack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Placement.FullStack.model.Project;
import com.Placement.FullStack.service.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/projects/{id}")
    public Project getProjectById(@PathVariable String id) {
        return projectService.getProjectById(id);
    }

    @PostMapping
    public Project saveProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }
}
