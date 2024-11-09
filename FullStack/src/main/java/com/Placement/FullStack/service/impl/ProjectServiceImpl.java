// package com.Placement.FullStack.service.impl;



// import com.Placement.FullStack.model.Project;
// import com.Placement.FullStack.repository.ProjectRepository;
// import com.Placement.FullStack.service.ProjectService;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service // Ensures this class is registered as a Spring Bean
// public class ProjectServiceImpl implements ProjectService {

//     private final ProjectRepository projectRepository;

//     @Autowired
//     public ProjectServiceImpl(ProjectRepository projectRepository) {
//         this.projectRepository = projectRepository;
//     }

//     @Override
//     public Project getProjectById(String id) {
//         return projectRepository.findById(id).orElse(null);
//     }

//     @Override
//     public List<Project> getAllProjects() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getAllProjects'");
//     }

//     @Override
//     public Project saveProject(Project project) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'saveProject'");
//     }

//     // Other methods for project CRUD operations
// }


package com.Placement.FullStack.service.impl;

import com.Placement.FullStack.model.Project;
import com.Placement.FullStack.repository.ProjectRepository;
import com.Placement.FullStack.service.ProjectService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project getProjectById(String id) {
        // Assuming you're using MongoDB, replace with actual logic to retrieve project by ID
        return projectRepository.findById(id).orElse(null);  // Return null if not found
    }

    @Override
    public List<Project> getAllProjects() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProjects'");
    }

    @Override
    public Project saveProject(Project project) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveProject'");
    }

    // Other methods can be added here as needed
}
